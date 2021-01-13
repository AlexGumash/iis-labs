package iteratorVisitor.visitor;

import iteratorVisitor.Car;

public class CarVisitor implements Visitor {
    @Override
    public String visitCar(Car car) {
        return car.brand + " " + car.model;
    }
}
