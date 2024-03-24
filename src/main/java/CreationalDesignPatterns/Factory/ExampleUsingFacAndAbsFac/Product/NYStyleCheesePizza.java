package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Product;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories.PizzaIngredientsFactory;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Dough;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Sauce;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Veggie;

import java.util.ArrayList;

public class NYStyleCheesePizza extends Pizza {

    PizzaIngredientsFactory pizzaIngredientsFactory;
    public NYStyleCheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
        name = "NY Style Sauce and Cheese Pizza";
        toppings.add("Grated Oregano Cheese");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = new Dough("Thin Crust Dough");
        sauce = new Sauce("Marinara Sauce");
        veggies.add(new Veggie("Grated Oregano Cheese"));

//        System.out.println("Tossing dough...");
//        System.out.println("Adding sauce...");
//        System.out.print("Adding toppings: ");
//        for (String topping : toppings) {
//            System.out.print(topping + ", ");
//        }
//        System.out.println();
    }
}
