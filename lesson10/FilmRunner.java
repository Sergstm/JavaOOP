package homework.lesson10;

import java.util.ArrayList;
import java.util.List;

public class FilmRunner {
    public static void main(String[] args) {

        Film film1 = new Film("Matrix", 1999, matrixActors(), matrixGenre());
        Film film2 = new Film("Mask", 1994, maskActors(), maskGenre());

        IOFilms films = new IOFilms();
        films.addFilms(film1);
        films.addFilms(film2);
//        System.out.println(films);

//        films.addToFile();
        films.getFromFile();



    }

    private static List<String> matrixActors() {
        List<String> actors = new ArrayList<>();
        actors.add("Keanu Reeves");
        actors.add("Laurence Fishburne");
        actors.add("Carrie-Anne Moss");
        return actors;
    }

    private static List<String> matrixGenre() {
        List<String> genre = new ArrayList<>();
        genre.add("Action");
        genre.add("Sci_fi");
        return genre;
    }

    private static List<String> maskActors() {
        List<String> actors = new ArrayList<>();
        actors.add("Jim Carrey");
        actors.add("Peter Green");
        actors.add("Cameron Diaz");
        return actors;
    }

    private static List<String> maskGenre() {
        List<String> genre = new ArrayList<>();
        genre.add("Action");
        genre.add("Comedy");
        return genre;
    }
}
