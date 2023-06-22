package StructuralDesignPatterns.Adapter.Example2;

import StructuralDesignPatterns.Adapter.Example2.RoundShape.RoundHole;
import StructuralDesignPatterns.Adapter.Example2.RoundShape.RoundPeg;
import StructuralDesignPatterns.Adapter.Example2.SquareShape.SquarePeg;
import StructuralDesignPatterns.Adapter.Example2.SquareShape.SquarePegAdapter;

public class Demo {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(4);

        System.out.println("RoundPeg with radius: " + roundPeg.getRadius() + ", fits in RoundHole with radius: " +
                roundHole.getRadius() + " : " + roundHole.fits(roundPeg));


        SquarePeg squarePeg = new SquarePeg(2);
        // Now we use SquarePegAdapter and convert the squarePeg to equivalent roundPeg;
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        System.out.println("SquarePeg with width: " + squarePeg.getWidth() + " has radius " + squarePegAdapter.getRadius()
                + ", fits in RoundHole with radius: " + roundHole.getRadius() + " : " + roundHole.fits(squarePegAdapter));


        SquarePeg squarePeg1 = new SquarePeg(10);
        // Now we use SquarePegAdapter and convert the squarePeg to equivalent roundPeg;
        SquarePegAdapter squarePegAdapter1 = new SquarePegAdapter(squarePeg1);

        System.out.println("SquarePeg with width: " + squarePeg1.getWidth() + " has radius " + squarePegAdapter1.getRadius()
                + ", fits in RoundHole with radius: " + roundHole.getRadius() + " : " + roundHole.fits(squarePegAdapter1));
    }
}
