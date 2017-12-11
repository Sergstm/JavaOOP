package homework.lesson3.cinema;

import java.util.Scanner;

public class CinemaRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Movie movie = new Movie();
        movie.setTitle("Avatar");
        movie.setYear(2009);
        movie.setDuration(161);
        movie.setDescription("Science fiction film");

        System.out.print("Enter quantity of tickets: ");
        int purchasedTickets = scanner.nextInt();

        HallForSession hallForSession = new HallForSession(15, 20);
        hallForSession.buyTicket(purchasedTickets);

        MovieSession movieSession = new MovieSession(movie, hallForSession);
        movieSession.setTicketPrice(10);
        movieSession.setStartTime("19:00");

        //Out
        System.out.println("Movie title = " + movie.getTitle());
        System.out.println("Movie year = " + movie.getYear());
        System.out.println("Movie duration = " + movie.getDuration() + " min");
        System.out.println("Movie description = " + movie.getDescription());
        System.out.println("Time to start = " + movieSession.getStartTime());
        System.out.println("Ticket price = $" + movieSession.getTicketPrice() + "\n");

        System.out.println("Free seats = " + hallForSession.getFree());
        System.out.println("Purchased seats = " + hallForSession.getPurchased());
        System.out.println("Final fees = $" + movieSession.resultFees());

    }
}
