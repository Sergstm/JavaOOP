package homework.lesson4.taxiTariffCalculator;

public class TaxiRunner {

    public static void main(String[] args) {

        //Create ride
        TaxiRide taxiRide1 = new TaxiRide(2, 10, 30);
        TaxiRide taxiRide2 = new TaxiRide(1, 50, 60);

        //Add rides
        TaxiRides taxiRides = new TaxiRides();
        taxiRides.add(taxiRide1);
        taxiRides.add(taxiRide2);

        //Create tariff
        TaxiTariff tariff = new Stand();
//        TaxiTariff tariff = new Family();

        long price = taxiRides.getPrice(tariff);

        String name = tariff.getClass().getSimpleName();
        System.out.println("All rides price for " + name + " tariff = " + price);
    }
}
