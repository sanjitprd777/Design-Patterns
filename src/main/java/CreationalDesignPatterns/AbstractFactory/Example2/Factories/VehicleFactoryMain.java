package CreationalDesignPatterns.AbstractFactory.Example2.Factories;

public class VehicleFactoryMain {

    public VehicleFactory getVehicleType(String input) {
        switch (input) {
            case "Car":
                return new CarFactory();
            case "Bike":
                return new BikeFactory();
            default:
                return null;
        }
    }
}
