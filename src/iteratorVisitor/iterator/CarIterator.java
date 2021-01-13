package iteratorVisitor.iterator;

import iteratorVisitor.Car;

public interface CarIterator {
    boolean hasNext();
    Car getNext();
    void iterateCars();
}
