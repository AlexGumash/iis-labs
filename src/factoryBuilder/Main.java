package factoryBuilder;


import factoryBuilder.factories.ClassicFactory;
import factoryBuilder.factories.ElectricFactory;
import factoryBuilder.factories.Factory;
import factoryBuilder.products.Bike;
import factoryBuilder.products.Wheelchair;

public class Main {
    public static void main(String[] args) {
        Factory classicFactory = new ClassicFactory();
        Factory electricFactory = new ElectricFactory();

        Bike bike = classicFactory.buildMTBBike();
        Wheelchair wheelchair = classicFactory.buildStandardWheelchair();
        Bike electricBike = electricFactory.buildMTBBike();
        Wheelchair electricWheelchair = electricFactory.buildStandardWheelchair();

        System.out.println(bike.toString());
        System.out.println(wheelchair.toString());
        System.out.println(electricBike.toString());
        System.out.println(electricWheelchair.toString());
    }
}
