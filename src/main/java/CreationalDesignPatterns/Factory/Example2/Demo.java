package CreationalDesignPatterns.Factory.Example2;

import CreationalDesignPatterns.Factory.Example2.Factories.ShapeFactory;
import CreationalDesignPatterns.Factory.Example2.Products.Shape;

public class Demo {

    public static void main(String ...args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShapeProduct("Circle");
        circle.draw();

        Shape square = shapeFactory.getShapeProduct("Square");
        square.draw();
    }
}
