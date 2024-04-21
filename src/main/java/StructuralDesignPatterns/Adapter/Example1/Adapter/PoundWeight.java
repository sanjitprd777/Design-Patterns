package StructuralDesignPatterns.Adapter.Example1.Adapter;

import StructuralDesignPatterns.Adapter.Example1.Adaptee.KGWeight;

public class PoundWeight implements PoundWeightInterface {

    private final KGWeight kgWeight;

    public PoundWeight() {
        kgWeight = new KGWeight();
    }


    @Override
    public double weightInPounds(double x) {
        return (kgWeight.weightInKG(x) * 20.0 / 9.0);
    }
}
