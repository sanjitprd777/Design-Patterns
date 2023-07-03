package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Product.Pizza;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Service.CaliforniaStylePizzaStore;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Service.ChicagoStylePizzaStore;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Service.NYStylePizzastore;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Service.PizzaStore;

public class Demo {

    public static void main(String... args) {
        System.out.println("Starting our Pizza Store to prepare Pizzas");

        PizzaStore nyPizzaStore = new NYStylePizzastore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Sanjit ordered pizza: " + pizza.getName());

        System.out.println();

        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        Pizza pizza1 = chicagoStore.orderPizza("cheese");
        System.out.println("Sahil ordered pizza: " + pizza1.getName());

        System.out.println();

        PizzaStore californiaStore = new CaliforniaStylePizzaStore();
        Pizza pizza2 = californiaStore.orderPizza("cheese");
        System.out.println("Surendra ordered pizza: " + pizza2.getName());
    }
}
