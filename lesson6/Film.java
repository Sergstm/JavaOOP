package homework.lesson6;

public class Film {

    private String filmName;
    private int year;
    private Actors actors;
    private Genre genre;

    Film(String filmName, int year, Actors actors, Genre genre) {
        this.filmName = filmName;
        this.year = year;
        this.actors = actors;
        this.genre = genre;
    }

    public String getFilmName() {
        return filmName;
    }

    public int getYear() {
        return year;
    }

    public Actors getActors() {
        return actors;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "\nFilm{" +
                "filmName='" + filmName + '\'' +
                ", year=" + year +
                ", actors=" + actors +
                ", genre=" + genre +
                '}';
    }
}
