package LLD.Game2048.entities;

public class Cell {

    Value value;

    public Cell(Value val) {
        this.value = val;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
