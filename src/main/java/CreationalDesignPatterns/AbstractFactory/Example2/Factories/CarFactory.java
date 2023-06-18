package CreationalDesignPatterns.AbstractFactory.Example2.Factories;

import CreationalDesignPatterns.AbstractFactory.Example2.Vehicle.Car;
import CreationalDesignPatterns.AbstractFactory.Example2.Vehicle.Vehicle;

public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicleType() {
        return new Car();
    }
}
