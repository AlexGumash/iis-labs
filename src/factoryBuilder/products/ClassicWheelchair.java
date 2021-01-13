package factoryBuilder.products;

public class ClassicWheelchair implements Wheelchair {
    private int wheels;
    private String saddle;
    private String drive;
    private String frame;
    private String brakes;

    public ClassicWheelchair(int wheels, String saddle, String drive, String frame, String brakes) {
        this.wheels = wheels;
        this.saddle = saddle;
        this.drive = drive;
        this.frame = frame;
        this.brakes = brakes;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Classic wheelchair: " + "\n";
        result += "Wheels: " + wheels + "\n";
        result += "Saddle: " + saddle + "\n";
        result += "Drive: " + drive + "\n";
        result += "Frame: " + frame + "\n";
        result += "Brakes: " + brakes + "\n";
        return result;
    }
}
