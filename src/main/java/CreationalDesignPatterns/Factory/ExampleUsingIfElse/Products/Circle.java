package CreationalDesignPatterns.Factory.ExampleUsingIfElse.Products;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
