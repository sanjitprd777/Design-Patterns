package CreationalDesignPatterns.Factory.Example2.Factories;

import CreationalDesignPatterns.Factory.Example2.Products.Shape;

public class ShapeCreator {

    private final ShapeFactory shapeFactory;

    public ShapeCreator(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public Shape getShape(String type) {
        return shapeFactory.getShapeProduct(type);

        /*
        Bad code to place here. Better move them to Factory:
        return switch (input) {
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            default -> null;
        };
        When you see code like this, you know that when it comes time for changes or extensions,
        you'll have to reopen this code and examine what needs to be added (or deleted).
        Often this kind of code ends up in several parts of the application,
        making maintenance and updates more difficult and error-prone.
        For better implementation: Checkout Example2.
        */
    }
}
