package StructuralDesignPatterns.Adapter.Example2.RoundShape;

public class RoundPeg {

    double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
