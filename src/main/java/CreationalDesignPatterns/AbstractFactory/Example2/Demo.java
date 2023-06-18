package CreationalDesignPatterns.AbstractFactory.Example2;

import CreationalDesignPatterns.AbstractFactory.Example2.Factories.VehicleFactory;
import CreationalDesignPatterns.AbstractFactory.Example2.Factories.VehicleFactoryMain;
import CreationalDesignPatterns.AbstractFactory.Example2.Vehicle.Vehicle;

public class Demo {

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactoryMain().getVehicleType("Car");

        Vehicle myVehicle = factory.getVehicleType();
        System.out.println(myVehicle.type());

        factory = new VehicleFactoryMain().getVehicleType("Bike");

        myVehicle = factory.getVehicleType();
        System.out.println(myVehicle.type());
    }
}
