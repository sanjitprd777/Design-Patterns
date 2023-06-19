package CreationalDesignPatterns.Factory.Example2.Products;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
