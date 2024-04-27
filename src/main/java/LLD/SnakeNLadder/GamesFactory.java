package LLD.SnakeNLadder;

import LLD.SnakeNLadder.entities.gameBoard.SnakeNLadderBoard;
import LLD.SnakeNLadder.entities.Player;
import LLD.SnakeNLadder.service.SnakeNLadder;

import java.util.Deque;

public class GamesFactory {

    public GamesFactory() {}

    public SnakeNLadder getSnakeNLadderGame(int N, int snake, int ladder, int dice, Deque<Player> players) {
        return new SnakeNLadder(N, snake, ladder, dice, players);
    }

}
