package LLD.ChessValidator.entities;

public class Move {
    public final String startCell;
    public final String endCell;

    public Move(String startCell, String endCell) {
        this.startCell = startCell;
        this.endCell = endCell;
    }
}
