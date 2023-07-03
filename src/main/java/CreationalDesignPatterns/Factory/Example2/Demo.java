package CreationalDesignPatterns.Factory.Example2;

import CreationalDesignPatterns.Factory.Example2.Factories.ShapeFactory;
import CreationalDesignPatterns.Factory.Example2.Factories.ShapeCreator;
import CreationalDesignPatterns.Factory.Example2.Products.Shape;

public class Demo {

    public static void main(String ...args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        ShapeCreator shapeCreator = new ShapeCreator(shapeFactory);
        Shape circle = shapeCreator.getShape("Circle");
        circle.draw();

        Shape square = shapeCreator.getShape("Square");
        square.draw();
    }
}
