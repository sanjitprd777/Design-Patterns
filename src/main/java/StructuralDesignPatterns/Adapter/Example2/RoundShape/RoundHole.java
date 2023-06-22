package StructuralDesignPatterns.Adapter.Example2.RoundShape;

public class RoundHole {

    double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return roundPeg.getRadius() <= radius;
    }
}
