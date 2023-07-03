package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Service;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories.NYPizzaIngredientsFactory;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories.PizzaIngredientsFactory;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Product.NYStyleCheesePizza;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Product.Pizza;

public class NYStylePizzastore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory pizzaIngredientsFactory = new NYPizzaIngredientsFactory();

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza(pizzaIngredientsFactory);
        }

        return pizza;
    }
}
