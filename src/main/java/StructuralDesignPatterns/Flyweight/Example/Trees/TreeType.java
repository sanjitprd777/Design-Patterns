package StructuralDesignPatterns.Flyweight.Example.Trees;

public class TreeType {
    private final String name;
    private final String color;
    private final String otherDetails;

    public TreeType(String name, String color, String otherDetails) {
        this.name = name;
        this.color = color;
        this.otherDetails = otherDetails;
    }

    public void draw(int x, int y) {
        System.out.println("Tree is: " + x + " : " + y + " and name is " + this.name + " color is " +
                this.color + " and others are " + this.otherDetails);
    }
}
