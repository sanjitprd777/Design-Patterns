package StructuralDesignPatterns.Decorator.Example1.BasePizza;

public class FarmHouse extends Pizza {

    public FarmHouse() {
        super.pizzaName = "FarmHouse";
    }

    @Override
    public double price() {
        return 150.50;
    }

    @Override
    public String pizzaName() {
        return "Pizza name is: " + super.pizzaName;
    }
}
