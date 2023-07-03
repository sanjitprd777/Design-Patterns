package CreationalDesignPatterns.Factory.ExampleUsingIfElse.Products;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
