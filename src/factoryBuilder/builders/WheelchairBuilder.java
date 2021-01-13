package factoryBuilder.builders;

import factoryBuilder.products.ClassicWheelchair;
import factoryBuilder.products.ElectricDriveWheelchair;
import factoryBuilder.products.Wheelchair;

public class WheelchairBuilder implements Builder {
    private int wheels;
    private String saddle;
    private String drive;
    private String frame;
    private String brakes;

    @Override
    public void setWheels(int numberOfWheels) {
        this.wheels = numberOfWheels;
    }

    @Override
    public void setSaddle(String saddle) {
        this.saddle = saddle;
    }

    @Override
    public void setDrive(String driveType) {
        this.drive = driveType;
    }

    @Override
    public void setFrame(String frameMaterial) {
        this.frame = frameMaterial;
    }

    @Override
    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }

    @Override
    public void reset() {
        this.wheels = 4;
        this.brakes = "standard";
        this.frame = "standard";
        this.saddle = "standard";
        this.drive = "classic";
    }

    public Wheelchair result() {
        if (drive.equals("electric")) {
            return new ElectricDriveWheelchair(wheels, saddle, drive, frame, brakes);
        } else if (drive.equals("classic")) {
            return new ClassicWheelchair(wheels, saddle, drive, frame, brakes);
        }
        return null;
    }
}
