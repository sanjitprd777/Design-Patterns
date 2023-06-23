package StructuralDesignPatterns.Decorator.Example1.BasePizza;

public class Margherita extends Pizza {

    public Margherita() {
        super.pizzaName = "Margherita";
    }

    @Override
    public double price() {
        return 100.12;
    }

    public String pizzaName() {
        return "Pizza name is: " + super.pizzaName;
    }
}
