package StructuralDesignPatterns.Decorator.Example1.BasePizza;

public class FarmHouse extends Pizza {

    public FarmHouse(Size size) {
        super("FarmHouse", size);
    }

    @Override
    public double price() {
        return switch (size) {
            case LARGE -> 350;
            case MEDIUM -> 300;
            case SMALL -> 200;
        };
    }
}
