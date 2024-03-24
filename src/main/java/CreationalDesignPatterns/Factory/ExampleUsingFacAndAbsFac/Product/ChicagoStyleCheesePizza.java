package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Product;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories.PizzaIngredientsFactory;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Dough;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Sauce;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Veggie;

import java.util.ArrayList;

public class ChicagoStyleCheesePizza extends Pizza {

    PizzaIngredientsFactory pizzaIngredientsFactory;
    public ChicagoStyleCheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        name = "Chicago Style Deep Dish Cheese Pizza";
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = new Dough("Extra Thick Crust Dough");
        sauce = new Sauce("Plum Tomato Sauce");
        veggies.add(new Veggie("Shredded Mozzarella Cheese"));
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
