package CreationalDesignPatterns.Builder.Example1.Builder;

import CreationalDesignPatterns.Builder.Example1.Car;
import CreationalDesignPatterns.Builder.Example1.Features.CarType;
import CreationalDesignPatterns.Builder.Example1.Features.Engine;
import CreationalDesignPatterns.Builder.Example1.Features.TripComputer;

public class AutomaticBuilder implements CarBuilder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private TripComputer tripComputer;

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

    public Car buildCar() {
        return new Car(carType, seats, engine, tripComputer);
    }
}
