package LLD.TicTacToe;

import LLD.TicTacToe.games.TicTacToe;

public class Main {

    public static void main(String[] args) {
        GameFactory gameFactory = new GameFactory();
        TicTacToe ticTacToe = gameFactory.getTicTacToe();
        ticTacToe.startGame();
    }
}
