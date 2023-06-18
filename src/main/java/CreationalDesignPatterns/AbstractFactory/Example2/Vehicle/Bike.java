package CreationalDesignPatterns.AbstractFactory.Example2.Vehicle;

public class Bike implements Vehicle {

    @Override
    public String type() {
        return "You choose Bike";
    }
}
