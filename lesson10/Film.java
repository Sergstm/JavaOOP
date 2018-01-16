package homework.lesson10;

import java.io.Serializable;
import java.util.List;

public class Film implements Serializable {

    static final long serialVersionUID = 312;

    private String name;
    private int year;
    private List<String> actors;
    private List<String> genre;

    Film(String name, int year, List<String> actors, List<String> genre) {
        this.name = name;
        this.year = year;
        this.actors = actors;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getActors() {
        return actors;
    }

    public List<String> getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", actors=" + actors +
                ", genre=" + genre +
                '}';
    }
}
