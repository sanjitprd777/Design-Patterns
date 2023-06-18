package CreationalDesignPatterns.AbstractFactory.Example2.Factories;

import CreationalDesignPatterns.AbstractFactory.Example2.Vehicle.Vehicle;

public interface VehicleFactory {

    public Vehicle getVehicleType();
}
