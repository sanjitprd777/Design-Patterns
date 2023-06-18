package CreationalDesignPatterns.AbstractFactory.Example2.Factories;

import CreationalDesignPatterns.AbstractFactory.Example2.Vehicle.Bike;
import CreationalDesignPatterns.AbstractFactory.Example2.Vehicle.Vehicle;

public class BikeFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicleType() {
        return new Bike();
    }
}
