package factoryBuilder.factories;

import factoryBuilder.products.Bike;
import factoryBuilder.products.Wheelchair;

public interface Factory {
    Bike buildStandardBike();
    Bike buildMTBBike();
    Wheelchair buildStandardWheelchair();
    Wheelchair buildRacingWheelchair();
}
