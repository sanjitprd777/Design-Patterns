package StructuralDesignPatterns.Adapter.Example2.SquareShape;

import StructuralDesignPatterns.Adapter.Example2.RoundShape.RoundPeg;

public class SquarePegAdapter extends RoundPeg {
    // Adaptee is RoundPeg.

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg peg) {
        this.squarePeg = peg;
    }

    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow(squarePeg.width / 2, 2) * 2));
    }
}
