package StructuralDesignPatterns.Decorator.Example1;

import StructuralDesignPatterns.Decorator.Example1.BasePizza.FarmHouse;
import StructuralDesignPatterns.Decorator.Example1.BasePizza.Margherita;
import StructuralDesignPatterns.Decorator.Example1.BasePizza.Pizza;
import StructuralDesignPatterns.Decorator.Example1.PizzaDecorator.Cheese;
import StructuralDesignPatterns.Decorator.Example1.PizzaDecorator.Paneer;

public class Demo {

    public static void main(String[] args) {
        Pizza pizza = new Margherita(Pizza.Size.MEDIUM);
        System.out.println("Your " + pizza.pizzaName() + " and the price is: " + pizza.price());

        System.out.println("Okay, adding extra cheese to order");
        pizza = new Cheese(pizza);
        System.out.println("Your " + pizza.pizzaName() + " and the price is: " + pizza.price());

        System.out.println("Okay, adding extra paneer to order");
        pizza = new Paneer(pizza);
        System.out.println("Your " + pizza.pizzaName() + " and the price is: " + pizza.price());

        System.out.println();

        Pizza pizza1 = new FarmHouse(Pizza.Size.LARGE);
        System.out.println("Your " + pizza1.pizzaName() + " and the price is: " + pizza1.price());

        System.out.println("Okay, adding extra paneer to order");
        pizza1 = new Paneer(pizza1);
        System.out.println("Your " + pizza1.pizzaName() + " and the price is: " + pizza1.price());

    }
}
