package CreationalDesignPatterns.Prototype.Example1;

import CreationalDesignPatterns.Prototype.Example1.Shapes.Circle;

public class Demo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 1;
        circle.y = 1;
        circle.color = "red";
        circle.name = "Circle1";

        Circle circleCopy = (Circle) circle.clone();

        if (circle != circleCopy) {
            System.out.println("Both circle are different objects");
            System.out.println(circle.hashCode());
            System.out.println(circleCopy.hashCode());
            System.out.println();

            if (circle.equals(circleCopy)) {
                System.out.println("Both circle are identical");
                System.out.println(circle);
                System.out.println(circleCopy);
            }
        }
    }
}
