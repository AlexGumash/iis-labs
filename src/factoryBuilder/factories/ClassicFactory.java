package factoryBuilder.factories;

import factoryBuilder.products.Bike;
import factoryBuilder.products.Wheelchair;
import factoryBuilder.builders.BikeBuilder;
import factoryBuilder.builders.WheelchairBuilder;

public class ClassicFactory implements Factory {
    private BikeBuilder bikeBuilder = new BikeBuilder();
    private WheelchairBuilder wheelchairBuilder = new WheelchairBuilder();

    @Override
    public Bike buildMTBBike() {
        bikeBuilder.reset();
        bikeBuilder.setDrive("classic");
        bikeBuilder.setFrame("carbon");
        bikeBuilder.setBrakes("203mm hydro");
        bikeBuilder.setSaddle("racing");
        bikeBuilder.setWheels(2);
        return bikeBuilder.result();
    }

    @Override
    public Wheelchair buildRacingWheelchair() {
        wheelchairBuilder.reset();
        wheelchairBuilder.setDrive("classic");
        wheelchairBuilder.setFrame("carbon");
        wheelchairBuilder.setBrakes("hand brake");
        wheelchairBuilder.setSaddle("carbon seat");
        wheelchairBuilder.setWheels(4);
        return wheelchairBuilder.result();
    }

    @Override
    public Bike buildStandardBike() {
        bikeBuilder.reset();
        bikeBuilder.setDrive("classic");
        return bikeBuilder.result();
    }

    @Override
    public Wheelchair buildStandardWheelchair() {
        wheelchairBuilder.reset();
        wheelchairBuilder.setDrive("classic");
        return wheelchairBuilder.result();
    }
}
