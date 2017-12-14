package homework.lesson4.taxiTariffCalculator;

public class TaxiRide {

    private int passengers;
    private int distance;
    private int duration;

    TaxiRide(int passengers, int distance, int duration) {
        this.passengers = passengers;
        this.distance = distance;
        this.duration = duration;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "TaxiRide{" +
                "passengers=" + passengers +
                ", distance=" + distance +
                ", duration=" + duration +
                '}';
    }
}
