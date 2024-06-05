package LLD.ChessValidator.controller;

import LLD.ChessValidator.boards.Board;
import LLD.ChessValidator.boards.ChessBoard;
import LLD.ChessValidator.entities.Cell;
import LLD.ChessValidator.entities.Move;
import LLD.ChessValidator.entities.Piece;
import LLD.ChessValidator.entities.PieceType;

public class ChessController {

    private final ChessBoard chessBoard;

    public ChessController(Board board) {
        chessBoard = (ChessBoard) board;
    }

    public void makeMove(Move move) throws Exception {

        Cell startCell = chessBoard.getCell(move.startCell);
        Cell endCell = chessBoard.getCell(move.endCell);

        validateMove(startCell, endCell, move);

        // Make move
        endCell.setPiece(startCell.getPiece());
        startCell.setPiece(new Piece(PieceType.N, null));
    }

    private void validateMove(Cell startCell, Cell endCell, Move move) throws Exception {
        // start cell and end cell must be within board.
        if (startCell == null || endCell == null)
            throw new RuntimeException("Either startCell or endCell is null");

        // start cell and end cell type should not be same.
        if (startCell.equals(endCell))
            throw new RuntimeException("startCell and endCell must be different");


        // Get piece and validate if move is valid
        Piece piece = startCell.getPiece();
        piece.getPieceBehavior().validateMove(chessBoard.getCellCord(move.startCell), chessBoard.getCellCord(move.endCell));
    }
}
