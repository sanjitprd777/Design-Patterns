package StructuralDesignPatterns.Decorator.Example1.PizzaDecorator;

import StructuralDesignPatterns.Decorator.Example1.BasePizza.Pizza;

public class Paneer extends Toppings {

    public Paneer(Pizza pizza) {
        super(pizza, "Paneer");
    }

    @Override
    public double price() {
        return pizza.price() + 30.0;
    }
}
