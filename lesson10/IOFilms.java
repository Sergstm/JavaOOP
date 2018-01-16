package homework.lesson10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFilms {

    private List<Film> films = new ArrayList<>();

    public void addFilms(Film film) {
        films.add(film);
    }

    public List<Film> getFilms() {
        return films;
    }

    public void addToFile() {
        File file = new File("src/homework/lesson10/data.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(String.valueOf(films));
            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getFromFile() {
        File file = new File("src/homework/lesson10/data.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String str = bufferedReader.readLine();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void serializeObj() {
        File file = new File("src/homework/lesson10/data.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(films);
            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserializeObj() {
        File file = new File("src/homework/lesson10/data.txt");
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            String str = String.valueOf(inputStream.readObject());
            System.out.println(str);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "IOFilms{" +
                "films=" + films +
                '}';
    }
}
