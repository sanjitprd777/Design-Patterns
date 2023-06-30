package StructuralDesignPatterns.Decorator.Example1.BasePizza;

public class Margherita extends Pizza {

    public Margherita(Size size) {
        super("Margherita", size);
    }

    @Override
    public double price() {
        return switch (size) {
            case LARGE -> 250;
            case MEDIUM -> 200;
            case SMALL -> 100;
        };
    }
}
