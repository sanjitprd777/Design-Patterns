package StructuralDesignPatterns.Decorator.Example2.Data;

public interface DataSource {

    void writeData(String data);
    String readData();
}
