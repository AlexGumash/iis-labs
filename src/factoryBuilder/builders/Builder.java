package factoryBuilder.builders;

public interface Builder {
    void setWheels(int numberOfWheels);
    void setSaddle(String saddle);
    void setDrive(String driveType);
    void setFrame(String frameMaterial);
    void setBrakes(String brakes);
    void reset();
}
