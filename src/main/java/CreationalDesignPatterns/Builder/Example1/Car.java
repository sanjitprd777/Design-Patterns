package CreationalDesignPatterns.Builder.Example1;

import CreationalDesignPatterns.Builder.Example1.Features.CarType;
import CreationalDesignPatterns.Builder.Example1.Features.Engine;
import CreationalDesignPatterns.Builder.Example1.Features.TripComputer;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final TripComputer tripComputer;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, TripComputer tripComputer) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", tripComputer=" + (tripComputer!=null?"Functional":"N/A") +
                '}';
    }
}
