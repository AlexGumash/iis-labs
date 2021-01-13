package factoryBuilder.products;

public class ClassicBike implements Bike{
    private int wheels;
    private String saddle;
    private String drive;
    private String frame;
    private String brakes;

    public ClassicBike(int wheels, String saddle, String drive, String frame, String brakes) {
        this.wheels = wheels;
        this.saddle = saddle;
        this.drive = drive;
        this.frame = frame;
        this.brakes = brakes;
    }

    public String toString() {
        String result = "";
        result += "Classic bike: " + "\n";
        result += "Wheels: " + wheels + "\n";
        result += "Saddle: " + saddle + "\n";
        result += "Drive: " + drive + "\n";
        result += "Frame: " + frame + "\n";
        result += "Brakes: " + brakes + "\n";
        return result;
    }
}
