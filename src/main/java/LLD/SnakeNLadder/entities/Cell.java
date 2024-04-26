package LLD.SnakeNLadder.entities;

public class Cell {

    private Jump jump;

    public Cell(Jump jump) {
        this.jump = jump;
    }

    public Jump getJump() {
        return jump;
    }

    public void setJump(Jump jump) {
        this.jump = jump;
    }
}
