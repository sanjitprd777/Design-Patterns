package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Service;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories.CaliforniaPizzaIngredientsFactory;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories.PizzaIngredientsFactory;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Product.CaliforniaStyleCheesePizza;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Product.Pizza;

public class CaliforniaStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory pizzaIngredientsFactory = new CaliforniaPizzaIngredientsFactory();
        
        if (type.equals("cheese")) {
            pizza = new CaliforniaStyleCheesePizza(pizzaIngredientsFactory);
        }
        
        return pizza;
    }
}
