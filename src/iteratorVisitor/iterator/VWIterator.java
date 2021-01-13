package iteratorVisitor.iterator;

import iteratorVisitor.Car;
import iteratorVisitor.visitor.CarVisitor;

import java.util.List;

public class VWIterator implements CarIterator {
    private List<Car> carsList;
    private CarVisitor visitor = new CarVisitor();
    private int counter = 0;

    public VWIterator(List<Car> carsList) {
        this.carsList = carsList;
    }

    @Override
    public boolean hasNext() {
        return counter < carsList.size();
    }

    @Override
    public Car getNext() {
        Car car = carsList.get(counter);
        counter += 1;
        return car;
    }

    @Override
    public void iterateCars() {
        while (hasNext()) {
            System.out.println(visitor.visitCar(getNext()));
        }
    }

}
