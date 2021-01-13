package template;

public abstract class Bike {
    String suspension;
    String wheels;
    String type;

    Bike() {};

    abstract void selectWheels();
    public String toString() {
        return "You selected " + type + " bike with " + wheels + " wheels\n" + "Suspension: " + suspension;
    };
}
