package LLD.ChessValidator.entities;

import LLD.ChessValidator.behavior.PieceBehavior;

public class Piece {

    PieceType pieceType;
    PieceBehavior pieceBehavior;

    public Piece(PieceType pieceType, PieceBehavior pieceBehavior) {
        this.pieceType = pieceType;
        this.pieceBehavior = pieceBehavior;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public PieceBehavior getPieceBehavior() {
        return pieceBehavior;
    }
}
