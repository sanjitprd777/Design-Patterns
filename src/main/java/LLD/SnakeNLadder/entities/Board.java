package LLD.SnakeNLadder.entities;

public class Board {

    private Cell[] cells;

    public Board(int N) {
        cells = new Cell[N*N];
        for (int i=0;i<N*N; ++i)
            cells[i] = new Cell(null);
    }

    public Cell[] getCells() {
        return cells;
    }

    public Cell getCells(int i) {
        return cells[i];
    }

    public void setCells(Cell[] cells) {
        this.cells = cells;
    }
}
