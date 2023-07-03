package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Service;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Product.Pizza;

public abstract class PizzaStore {
    /*
    This method is the client of the factory.
     */
    public Pizza orderPizza(String type) {
        Pizza pizza;

        /*
        The reason we moved the code to SimplePizzaFactory is that we want to avoid any dependency from it. There may
        be many clients of that factory and any change there will not affect this service.
         */
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /*
    This is called the factory method or "Factory Method Pattern."
    The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class
    to instantiate. Factory Method lets a class deferred instantiation to subclasses.
     */
    protected abstract Pizza createPizza(String type);
}
