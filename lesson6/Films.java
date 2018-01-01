package homework.lesson6;

import java.util.ArrayList;

public class Films {

    private ArrayList<Film> films = new ArrayList<>();

    public void addFilms(Film film) {
        films.add(film);
    }

    public ArrayList<Film> sortByYear(int year1, int year2) {
        ArrayList<Film> result = new ArrayList<>();
        for (Film elem : films) {
            if (elem.getYear() >= year1 && elem.getYear() <= year2) {
                result.add(elem);
            }
        }
        return result;
    }

    public ArrayList<Film> sortByActors(String str) {
        Actors act = Actors.valueOf(str.toUpperCase());
        ArrayList<Film> result = new ArrayList<>();
        for (Film elem : films) {
            if (elem.getActors().equals(act)) {
                result.add(elem);
            }
        }
        return result;
    }

    public ArrayList<Film> sortByGenre(String str) {
        Genre gen = Genre.valueOf(str.toUpperCase());
        ArrayList<Film> result = new ArrayList<>();
        for (Film elem : films) {
            if (elem.getGenre().equals(gen)) {
                result.add(elem);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Films{" +
                "films=" + films +
                '}';
    }
}
