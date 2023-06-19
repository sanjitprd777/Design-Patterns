package CreationalDesignPatterns.AbstractFactory.Example2.Factories;

public class VehicleFactoryMain {

    public VehicleFactory getVehicleType(String input) {
        return switch (input) {
            case "Car" -> new CarFactory();
            case "Bike" -> new BikeFactory();
            default -> null;
        };
    }
}
