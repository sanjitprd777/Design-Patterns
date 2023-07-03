package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Cheese;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Dough;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Sauce;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Veggie;

import java.util.List;

/*
This is called an Abstractory Factory Method.
 */
public interface PizzaIngredientsFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    List<Veggie> createVeggies();
}
