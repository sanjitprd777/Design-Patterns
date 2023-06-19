package CreationalDesignPatterns.Builder.Example1.Builder;

import CreationalDesignPatterns.Builder.Example1.Features.CarType;
import CreationalDesignPatterns.Builder.Example1.Features.Engine;
import CreationalDesignPatterns.Builder.Example1.Features.TripComputer;
import CreationalDesignPatterns.Builder.Example1.ManualCar;

public class ManualBuilder implements CarBuilder {

    private CarType carType;
    private Engine engine;
    private TripComputer tripComputer;
    private int seats;

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setSeat(int seat) {
        this.seats = seat;
    }

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public ManualCar buildCar() {
        return new ManualCar(carType, seats, engine, tripComputer);
    }
}
