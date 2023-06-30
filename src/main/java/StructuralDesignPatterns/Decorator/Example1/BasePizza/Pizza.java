package StructuralDesignPatterns.Decorator.Example1.BasePizza;

public abstract class Pizza {

    public enum Size {SMALL, MEDIUM, LARGE};

    Size size;
    String pizzaName;

    public Pizza() {}

    public Pizza(String pizzaName, Size size) {
        this.pizzaName = pizzaName;
        this.size = size;
    }

    public abstract double price();

    public String pizzaName() {
        return "Pizza name is: " + size.toString() + " " + pizzaName;
    }
}
