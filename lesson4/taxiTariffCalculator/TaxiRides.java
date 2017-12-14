package homework.lesson4.taxiTariffCalculator;

import java.util.ArrayList;
import java.util.List;

public class TaxiRides {

    private List<TaxiRide> taxiRides = new ArrayList<>();

    public void add(TaxiRide taxiRide) {
        taxiRides.add(taxiRide);
    }

    public long getPrice(TaxiTariff taxiTariff) {
        long price = 0;
        for (TaxiRide ride : taxiRides) {
            price += taxiTariff.calculatePrice(ride);
        }
        return price;
    }

    @Override
    public String toString() {
        return "TaxiRides{" +
                "taxiRides=" + taxiRides +
                '}';
    }
}
