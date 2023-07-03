package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Product.Pizza;

/*
This is a simple factory pattern where we create a factory and encapsulates all the product creation in one class.
The problem with this approach is there is no way to define the type of product we want with more granularity.
Like if we want cheese pizza for NY, Chicago, then we need to pass lots of parameters and there will be multiple if-else
code implementation to get it. Hence, factory method patterns work best in this case.
 */
public class SimplePizzaFactory {

    /*
    We do not use static method here because subclassing is not possible then.
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
//            pizza = new CheesePizza();
        }

        return pizza;
    }
}
