package homework.lesson3.cinema;

public class HallForSession {

    private int rows;
    private int seats;
    private int free;
    private int purchased = 0;

    HallForSession(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
        free = rows * seats;
    }

    public int getFree() {
        return free;
    }

    public int getPurchased() {
        return purchased;
    }

    public void buyTicket(int tickets) {
        if (tickets > free || tickets < 0) {
            System.out.println("Not enough seats");
            System.out.println("Enter correct value");
        } else if (tickets > 0) {
            free -= tickets;
            purchased += tickets;
        }
    }

    @Override
    public String toString() {
        return "HallForSession{" +
                "rows=" + rows +
                ", seats=" + seats +
                ", free=" + free +
                ", purchased=" + purchased +
                '}';
    }
}
