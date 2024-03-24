package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Product;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories.PizzaIngredientsFactory;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Dough;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Sauce;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Veggie;

import java.util.ArrayList;

public class CaliforniaStyleCheesePizza extends Pizza {

    PizzaIngredientsFactory pizzaIngredientsFactory;

    public CaliforniaStyleCheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        name = "California Style Cheese Pizza";
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = new Dough("Thick Crust Dough");
        sauce = new Sauce("Spicy Sauce");
        veggies.add(new Veggie("Healthy Cheese"));
    }
}
