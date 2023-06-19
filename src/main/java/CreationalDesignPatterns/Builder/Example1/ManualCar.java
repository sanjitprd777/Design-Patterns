package CreationalDesignPatterns.Builder.Example1;

import CreationalDesignPatterns.Builder.Example1.Features.CarType;
import CreationalDesignPatterns.Builder.Example1.Features.Engine;
import CreationalDesignPatterns.Builder.Example1.Features.TripComputer;

public class ManualCar {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final TripComputer tripComputer;

    public ManualCar(CarType carType, int seats, Engine engine, TripComputer tripComputer) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
    }

    @Override
    public String toString() {
        return "ManualCar{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", tripComputer=" + (tripComputer!=null?"Functional":"N/A") +
                '}';
    }
}
