package homework.lesson6;

public class FilmsRunner {

    public static void main(String[] args) {

        Film film1 = new Film("Terminator", 1984, Actors.SCHWARZENEGGER, Genre.ACTION);
        Film film2 = new Film("Mask", 1994, Actors.CARREY, Genre.COMEDY);
        Film film3 = new Film("Cobra", 1986, Actors.STALLONE, Genre.ACTION);
        Film film4 = new Film("Matrix", 1999, Actors.REEVES, Genre.SCI_FI);

        Films films = new Films();
        films.addFilms(film1);
        films.addFilms(film2);
        films.addFilms(film3);
        films.addFilms(film4);

        System.out.println(films.sortByYear(1994, 2000));
        System.out.println(films.sortByActors("Carrey"));
        System.out.println(films.sortByGenre("Action"));
    }
}
