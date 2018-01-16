package homework.lesson10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(file));
            printWriter.print(films);
            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            Objects.requireNonNull(printWriter).close();
        }
    }

    public void getFromFile() {
        File file = new File("src/homework/lesson10/data.txt");

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                Objects.requireNonNull(bufferedReader).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public String toString() {
        return "IOFilms{" +
                "films=" + films +
                '}';
    }
}
