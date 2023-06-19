package CreationalDesignPatterns.Builder.Example1;

import CreationalDesignPatterns.Builder.Example1.Builder.AutomaticBuilder;
import CreationalDesignPatterns.Builder.Example1.Builder.ManualBuilder;
import CreationalDesignPatterns.Builder.Example1.Director.CarDirector;

public class Demo {

    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();

        AutomaticBuilder builder = new AutomaticBuilder();
        carDirector.constructSportsCar(builder);

        Car car = builder.buildCar();
        System.out.println(car.toString());

        ManualBuilder builder1 = new ManualBuilder();
        carDirector.constructCommercialCar(builder1);

        ManualCar manualCar = builder1.buildCar();
        System.out.println(manualCar.toString());
    }
}
