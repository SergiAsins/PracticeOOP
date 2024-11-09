package PracticeOOP;

public abstract class Vehicle {
    private String brand;
    protected int velocity;
    protected int wheels;

    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
        this.velocity = 0;
    }

    public abstract void accelerate();
    public abstract void brake();

    public int getVelocity() {
        return velocity;
    }

    public int getWheels() {
        return wheels;
    }

    public String getBrand() {
        return brand;
    }
}
