package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Cheese;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Dough;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Sauce;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Veggie;

import java.util.ArrayList;
import java.util.List;

public class ChicagoPizzaIngredientsFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return new Dough("Thin Crust Dough");
    }

    @Override
    public Sauce createSauce() {
        return new Sauce("Chicago Sauce");
    }

    @Override
    public Cheese createCheese() {
        return new Cheese("Chicago Cheese");
    }

    @Override
    public List<Veggie> createVeggies() {
        return new ArrayList<>();
    }
}
