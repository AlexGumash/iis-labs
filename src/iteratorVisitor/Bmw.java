package iteratorVisitor;

import iteratorVisitor.iterator.BMWIterator;
import iteratorVisitor.iterator.CarIterator;

import java.util.ArrayList;
import java.util.List;

public class Bmw implements CarBrand {
    private List<Car> carsList = new ArrayList<>();

    Bmw() {
        this.carsList.add(new Car("BWM", "X6"));
        this.carsList.add(new Car("BWM", "X5"));
        this.carsList.add(new Car("BWM", "X1"));
    }

    @Override
    public CarIterator showAllCarsIterator() {
        return new BMWIterator(carsList);
    }

}
