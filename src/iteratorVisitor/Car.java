package iteratorVisitor;

import iteratorVisitor.visitor.Visitor;

public class Car implements Transport{
    public String brand;
    public String model;

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCar(this);
    }
}
