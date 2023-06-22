package StructuralDesignPatterns.Adapter.Example1;

import StructuralDesignPatterns.Adapter.Example1.Adapter.PoundWeight;

public class Demo {

    public static void main(String[] args) {
        double x = 5;
        System.out.println("Weight in KG: " + x);

        PoundWeight poundWeight = new PoundWeight();
        System.out.println("Weight in Pound: " + poundWeight.weightInPounds(x));
    }
}
