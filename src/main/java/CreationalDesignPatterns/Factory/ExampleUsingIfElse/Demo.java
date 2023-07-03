package CreationalDesignPatterns.Factory.ExampleUsingIfElse;

import CreationalDesignPatterns.Factory.ExampleUsingIfElse.Factories.ShapeFactory;
import CreationalDesignPatterns.Factory.ExampleUsingIfElse.Factories.ShapeCreator;

public class Demo {

    public static void main(String ...args) {
        ShapeCreator shapeCreator = new ShapeCreator(new ShapeFactory());
        shapeCreator.getShape("Circle");
        shapeCreator.getShape("Square");
    }
}
