package LLD.ChessValidator.games;

import LLD.ChessValidator.boards.Board;
import LLD.ChessValidator.boards.ChessBoard;

public class ChessGame extends Game {

    public Board board;

    public ChessGame(String name) {
        super(name);
        initBoard();
    }

    @Override
    void initBoard() {
        switch (name) {
            case "TwoPlayerChessGame": {
                this.board = new ChessBoard(8);
                break;
            }
            default: {
                board = null;
            }
        }
    }
}
