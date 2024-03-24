package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Product;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Cheese;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Dough;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Sauce;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Veggie;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    List<Veggie> veggies = new ArrayList<>();
    Cheese cheese;
    List<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
