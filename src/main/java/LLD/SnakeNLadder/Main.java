package LLD.SnakeNLadder;

import LLD.SnakeNLadder.entities.Player;
import LLD.SnakeNLadder.service.SnakeNLadder;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        Deque<Player> players = new ArrayDeque<>();
        players.addLast(new Player("Sanjit", 0));
        players.addLast(new Player("Sahil", 0));
        players.addLast(new Player("Surendra", 0));

        GamesFactory gamesFactory = new GamesFactory();

        SnakeNLadder snakeNLadder = gamesFactory.getSnakeNLadderGame(10, 5, 6, 6, players);
        snakeNLadder.startGame();
    }
}
