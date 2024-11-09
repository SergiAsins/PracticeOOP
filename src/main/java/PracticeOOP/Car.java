package PracticeOOP;

public class Car extends Vehicle {
    public Car(String brand, int wheels) {
        super(brand, wheels);
    }

    public void accelerate() {
        this.velocity += 40;
    }

    public void brake() {
        this.velocity -= 40;
    }
}
