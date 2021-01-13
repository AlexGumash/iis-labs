package iteratorVisitor;

import iteratorVisitor.iterator.CarIterator;
import iteratorVisitor.iterator.VWIterator;

import java.util.ArrayList;
import java.util.List;

public class Vw implements CarBrand {
    private List<Car> carsList = new ArrayList<>();

    Vw() {
        this.carsList.add(new Car("VW", "Polo"));
        this.carsList.add(new Car("VW", "Tuareg"));
        this.carsList.add(new Car("VW", "Caddy"));
    }
    @Override
    public CarIterator showAllCarsIterator() {
        return new VWIterator(carsList);
    }


}
