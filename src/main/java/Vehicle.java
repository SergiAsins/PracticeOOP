public class Vehicle {
    private String brand;
    protected int velocity;
    protected int wheels;

    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = velocity;
    }

    public void accelerate(){
        this.velocity += 10;
    }

    public void brake(){
        this.velocity -= 10;
    }

    public int getVelocity() {
        return velocity;
    }
}
