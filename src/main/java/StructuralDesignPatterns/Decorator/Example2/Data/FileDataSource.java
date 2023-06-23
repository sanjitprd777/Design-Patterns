package StructuralDesignPatterns.Decorator.Example2.Data;

public class FileDataSource implements DataSource {

    String data;

    @Override
    public void writeData(String data) {
        this.data = data;
    }

    @Override
    public String readData() {
        return data;
    }
}
