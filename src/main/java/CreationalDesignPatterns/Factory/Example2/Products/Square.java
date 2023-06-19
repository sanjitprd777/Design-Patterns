package CreationalDesignPatterns.Factory.Example2.Products;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
