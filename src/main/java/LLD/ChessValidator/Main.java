package LLD.ChessValidator;

import LLD.ChessValidator.boards.ChessBoard;
import LLD.ChessValidator.controller.ChessController;
import LLD.ChessValidator.entities.Move;
import LLD.ChessValidator.factory.GameFactory;
import LLD.ChessValidator.games.ChessGame;

public class Main {

    // Problem Statement:
    // https://workat.tech/machine-coding/practice/design-chess-validator-to77d8oqpx2h
    public static void main(String[] args) {
        GameFactory gameFactory = new GameFactory();

        ChessGame chessGame = (ChessGame) gameFactory.getGame("Chess");

        chessGame.printGameName();

        ChessBoard board = (ChessBoard) chessGame.board;
        board.printBoard();

        ChessController chessController = new ChessController(board);

        try {
            /*



            b8 c6
            d1 h5
            g8 f6
            h5 f7
            f8 f7
            g7 f7
            h8 f7
            d8 f7
            c6 f7
            c4 f7
            h8 g8
            f2 f4
            e5 f4
            f7 e8
            exit
             */
            chessController.makeMove(new Move("e2", "e4"));
            board.printBoard();

            chessController.makeMove(new Move("e7", "e5"));
            board.printBoard();

            chessController.makeMove(new Move("f1", "c4"));
            board.printBoard();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
