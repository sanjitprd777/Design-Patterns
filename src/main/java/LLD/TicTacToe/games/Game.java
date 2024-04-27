package LLD.TicTacToe.games;

import LLD.TicTacToe.entities.Player;

public abstract class Game {

    abstract void startGame();
    abstract boolean hasMoves();
    abstract boolean makeMove(Player player, int x, int y);
    abstract boolean isWinner(Player player, int x, int y);
}
