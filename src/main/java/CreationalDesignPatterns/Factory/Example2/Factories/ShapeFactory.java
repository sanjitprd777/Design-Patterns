package CreationalDesignPatterns.Factory.Example2.Factories;

import CreationalDesignPatterns.Factory.Example2.Products.Circle;
import CreationalDesignPatterns.Factory.Example2.Products.Shape;
import CreationalDesignPatterns.Factory.Example2.Products.Square;

public class ShapeFactory {

    public Shape getShapeProduct(String input) {
        return switch (input) {
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            default -> null;
        };
    }
}
