package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Service;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories.ChicagoPizzaIngredientsFactory;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories.PizzaIngredientsFactory;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Product.ChicagoStyleCheesePizza;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Product.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory pizzaIngredientsFactory = new ChicagoPizzaIngredientsFactory();

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza(pizzaIngredientsFactory);
        }

        return pizza;
    }
}
