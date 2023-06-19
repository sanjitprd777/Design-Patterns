package CreationalDesignPatterns.Builder.Example1.Director;

import CreationalDesignPatterns.Builder.Example1.Builder.CarBuilder;
import CreationalDesignPatterns.Builder.Example1.Features.CarType;
import CreationalDesignPatterns.Builder.Example1.Features.Engine;
import CreationalDesignPatterns.Builder.Example1.Features.TripComputer;

public class CarDirector {

    public void constructSportsCar(CarBuilder builder) {
        builder.setCarType(CarType.SPORTS);
        builder.setSeat(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTripComputer(new TripComputer());
    }

    public void constructCityCar(CarBuilder builder) {
        builder.setCarType(CarType.ORDINARY);
        builder.setSeat(4);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTripComputer(new TripComputer());
    }

    public void constructCommercialCar(CarBuilder builder) {
        builder.setCarType(CarType.COMMERCIAL);
        builder.setSeat(8);
        builder.setEngine(new Engine(1.0, 0));
        builder.setTripComputer(new TripComputer());
    }
}
