package LLD.ChessValidator.entities;

public class Cell {

    Piece piece;

    public Cell(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
