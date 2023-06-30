package StructuralDesignPatterns.Decorator.Example2.DataDecorator;

import StructuralDesignPatterns.Decorator.Example2.Data.DataSource;

public class DataSourceDecorator implements DataSource {

    // HAS-A relationship.
    private final DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
