package LLD.TicTacToe;

import LLD.TicTacToe.entities.Piece;
import LLD.TicTacToe.entities.PieceType;
import LLD.TicTacToe.entities.Player;
import LLD.TicTacToe.games.TicTacToe;

import java.util.ArrayDeque;
import java.util.Deque;

public class GameFactory {

    public GameFactory() {
    }

    public TicTacToe getTicTacToe() {
        Deque<Player> players = new ArrayDeque<>();
        players.addLast(new Player("Sanjit", new Piece(PieceType.X)));
        players.addLast(new Player("Sahil", new Piece(PieceType.O)));
        return new TicTacToe(players, 3);
    }
}
