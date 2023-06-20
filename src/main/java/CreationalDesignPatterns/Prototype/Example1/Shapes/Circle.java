package CreationalDesignPatterns.Prototype.Example1.Shapes;

import java.util.Objects;

public class Circle extends Shape{

    public String name;

    public Circle() {}

    public Circle(Circle target) {
        super(target);
        if(target != null) {
            this.name = target.name;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(super.equals(object2)) || !(object2 instanceof Circle circle))    return false;
        return Objects.equals(this.name, circle.name);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
