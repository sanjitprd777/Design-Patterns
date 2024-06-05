package LLD.ChessValidator.factory;

import LLD.ChessValidator.games.ChessGame;
import LLD.ChessValidator.games.Game;

public class GameFactory {

    public Game getGame(String gameName) {
        switch (gameName) {
            case "Chess": {
                return new ChessGame("TwoPlayerChessGame");
            }
            default: {
                return null;
            }
        }
    }
}
