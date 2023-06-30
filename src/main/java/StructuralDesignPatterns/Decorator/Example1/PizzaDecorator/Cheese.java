package StructuralDesignPatterns.Decorator.Example1.PizzaDecorator;

import StructuralDesignPatterns.Decorator.Example1.BasePizza.Pizza;

public class Cheese extends Toppings {

    public Cheese(Pizza pizza) {
        super(pizza, "Cheese");
    }

    @Override
    public double price() {
        return pizza.price() + 20.0;
    }
}
