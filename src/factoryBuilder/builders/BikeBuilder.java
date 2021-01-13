package factoryBuilder.builders;

import factoryBuilder.products.Bike;
import factoryBuilder.products.ClassicBike;
import factoryBuilder.products.ElectricDriveBike;

public class BikeBuilder implements Builder {
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
        this.wheels = 2;
        this.brakes = "standard";
        this.frame = "standard";
        this.saddle = "standard";
        this.drive = "classic";
    }

    public Bike result() {
        if (drive.equals("electric")) {
            return new ElectricDriveBike(wheels, saddle, drive, frame, brakes);
        } else if (drive.equals("classic")) {
            return new ClassicBike(wheels, saddle, drive, frame, brakes);
        }
        return null;
    }
}
