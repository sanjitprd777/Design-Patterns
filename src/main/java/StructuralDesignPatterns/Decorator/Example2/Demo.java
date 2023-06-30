package StructuralDesignPatterns.Decorator.Example2;

import StructuralDesignPatterns.Decorator.Example2.Data.DataSource;
import StructuralDesignPatterns.Decorator.Example2.Data.FileDataSource;
import StructuralDesignPatterns.Decorator.Example2.DataDecorator.DataSourceDecorator;
import StructuralDesignPatterns.Decorator.Example2.DataDecorator.EncryptData;

public class Demo {

    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource();
        dataSource.writeData("Sanjit Prasad");
        System.out.println("Reading original data from source:");
        System.out.println(dataSource.readData());
        System.out.println();

        System.out.println("Encoding data:");
        DataSourceDecorator encryptDataSource = new EncryptData(dataSource);
        encryptDataSource.writeData(dataSource.readData());
        System.out.println("Encoded data is: " + dataSource.readData());
        System.out.println("Decoding data:");
        System.out.println("Decoded data is: " + encryptDataSource.readData());
    }
}
