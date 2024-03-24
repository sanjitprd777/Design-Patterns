package CreationalDesignPatterns.Factory.ExampleUsingIfElse;

import CreationalDesignPatterns.Factory.ExampleUsingIfElse.Factory.ShapeFactory;
import CreationalDesignPatterns.Factory.ExampleUsingIfElse.Factory.ShapeCreator;

public class Demo {

    public static void main(String ...args) {
        ShapeCreator shapeCreator = new ShapeCreator(new ShapeFactory());
        shapeCreator.getShape("Circle");
        shapeCreator.getShape("Square");
    }
}
