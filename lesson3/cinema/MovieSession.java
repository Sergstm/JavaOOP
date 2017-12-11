package homework.lesson3.cinema;

public class MovieSession {

    private Movie movie;
    private HallForSession hall;
    private int ticketPrice;
    private String startTime;

    MovieSession(Movie movie, HallForSession hall) {
        this.movie = movie;
        this.hall = hall;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public String getStartTime() {
        return startTime;
    }

    public int resultFees() {
        int result = hall.getPurchased() * ticketPrice;
        return result;
    }

    @Override
    public String toString() {
        return "MovieSession{" +
                "movie=" + movie +
                ", hall=" + hall +
                ", ticketPrice=" + ticketPrice +
                ", startTime=" + startTime +
                '}';
    }
}
