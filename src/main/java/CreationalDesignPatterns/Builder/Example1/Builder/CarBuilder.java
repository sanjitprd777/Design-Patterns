package CreationalDesignPatterns.Builder.Example1.Builder;

import CreationalDesignPatterns.Builder.Example1.Features.CarType;
import CreationalDesignPatterns.Builder.Example1.Features.Engine;
import CreationalDesignPatterns.Builder.Example1.Features.TripComputer;

public interface CarBuilder {

    void setEngine(Engine engine);
    void setTripComputer(TripComputer tripComputer);
    void setSeat(int seat);
    void setCarType(CarType carType);
}
