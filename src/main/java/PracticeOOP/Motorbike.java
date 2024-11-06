package PracticeOOP;

public class Motorbike extends Vehicle{
    public Motorbike(String brand, int wheels) {
        super(brand, wheels);
    }

    @Override
    public void accelerate() {
        this.velocity += 20;
    }

    @Override
    public void brake() {
        this.velocity += 20;
    }
}
