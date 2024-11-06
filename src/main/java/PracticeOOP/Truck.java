package PracticeOOP;

public class Truck extends Vehicle {
    public Truck(String brand, int wheels) {
        super(brand, wheels);
    }
        @Override
        public void accelerate() {
            this.velocity += 60;
        }

        @Override
        public void brake() {
            this.velocity += 60;
    }
}
