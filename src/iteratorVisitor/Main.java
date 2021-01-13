package iteratorVisitor;

public class Main {
    public static void main(String[] args) {
        Bmw bmwBrand = new Bmw();
        Vw vwBrand = new Vw();
        bmwBrand.showAllCarsIterator().iterateCars();
        vwBrand.showAllCarsIterator().iterateCars();
    }
}
