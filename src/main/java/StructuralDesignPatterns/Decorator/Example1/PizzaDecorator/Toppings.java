package StructuralDesignPatterns.Decorator.Example1.PizzaDecorator;

import StructuralDesignPatterns.Decorator.Example1.BasePizza.Pizza;

public abstract class Toppings extends Pizza {
    String toppingName;
    Pizza pizza;

    public Toppings(Pizza pizza, String toppingName) {
        this.pizza = pizza;
        this.toppingName = toppingName;
    }

    public String pizzaName() {
        return pizza.pizzaName() + ", " + toppingName;
    }
}
