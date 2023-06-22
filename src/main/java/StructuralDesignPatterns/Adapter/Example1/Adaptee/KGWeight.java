package StructuralDesignPatterns.Adapter.Example1.Adaptee;

public class KGWeight implements KGWeightInterface {

    public KGWeight() {}

    @Override
    public double weightInKG(double x) {
        return x;
    }
}
