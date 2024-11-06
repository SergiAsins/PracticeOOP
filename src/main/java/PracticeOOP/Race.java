package PracticeOOP;

import java.util.List;

public class Race {
    List<Vehicle> mainGroup = List.of(
            new Truck("Lorry", 4),
            new Car("Aston Martin", 4),
            new Motorbike("Docker", 2)
    );
    public void startRace() {
        for (Vehicle vehicle : mainGroup) {
            vehicle.accelerate();
            System.out.println(vehicle.getClass().getSimpleName() + " (" + vehicle.getVelocity() + " km/h)");
        }
    }
}




