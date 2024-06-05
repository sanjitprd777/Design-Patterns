package LLD.ChessValidator.entities;

public class Player {

    final String name;
    final PieceType pieceType;

    public Player(String name, PieceType pieceType) {
        this.name = name;
        this.pieceType = pieceType;
    }
}
