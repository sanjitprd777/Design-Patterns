package CreationalDesignPatterns.AbstractFactory.Example2.Vehicle;

public class Car implements Vehicle {

    @Override
    public String type() {
        return "You choose Car";
    }
}
