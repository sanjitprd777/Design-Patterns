package StructuralDesignPatterns.Decorator.Example2.DataDecorator;

import StructuralDesignPatterns.Decorator.Example2.Data.DataSource;

import java.util.Base64;

public class EncryptData extends DataSourceDecorator {

    public EncryptData(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i=0; i< result.length; i++) {
            result[i] += (byte)1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i=0; i<result.length; ++i) {
            result[i] -= (byte)1;
        }
        return new String(result);
    }
}
