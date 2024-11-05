public class Main {
    public static void main(String[] args) {
        Car car = new Car("Xiaomi", 5);
        Motorbike motorbike = new Motorbike("Yamaha", 2);

        System.out.println("Car drives " + car.getVelocity()); //try getVelocity
        System.out.println("Motorbike drives " + motorbike.getVelocity());

        car.accelerate();
        System.out.println("Car accelerates and drives " + car.getVelocity());

        motorbike.accelerate();
        System.out.println(("Motorbike accelerates and drives " + motorbike.getVelocity()));
    }
}
