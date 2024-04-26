package LLD.SnakeNLadder;

import LLD.SnakeNLadder.entities.Player;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        Deque<Player> players = new ArrayDeque<>();
        players.addLast(new Player("Sanjit", 0));
        players.addLast(new Player("Sahil", 0));
        players.addLast(new Player("Surendra", 0));

        Game game = new Game(10, 5, 6,6, players);

        game.startGame();
    }
}
