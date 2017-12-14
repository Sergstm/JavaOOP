package homework.lesson4.taxiTariffCalculator;

public class Stand implements TaxiTariff{

    @Override
    public long calculatePrice(TaxiRide ride) {
        return 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
    }
}
