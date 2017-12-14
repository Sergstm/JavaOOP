package homework.lesson4.taxiTariffCalculator;

public class Family implements TaxiTariff{

    @Override
    public long calculatePrice(TaxiRide ride) {
        return 50 + 20 * ride.getDistance() / ride.getPassengers();
    }
}
