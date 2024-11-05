public class Car extends Vehicle {
    public Car(String brand, int wheels) {
        super(brand, wheels);
    }

    @Override
    public void accelerate() {
        this.velocity += 40;
    }

    @Override
    public void brake() {
        this.velocity -= 40;
    }
}
