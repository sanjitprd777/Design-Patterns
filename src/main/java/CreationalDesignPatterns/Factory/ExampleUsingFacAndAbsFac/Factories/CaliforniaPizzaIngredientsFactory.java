package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Cheese;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Dough;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Sauce;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Veggie;

import java.util.List;

public class CaliforniaPizzaIngredientsFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public List<Veggie> createVeggies() {
        return null;
    }
}
