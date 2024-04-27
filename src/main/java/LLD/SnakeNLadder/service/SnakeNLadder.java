package LLD.SnakeNLadder.service;

import LLD.SnakeNLadder.entities.Cell;
import LLD.SnakeNLadder.entities.Player;
import LLD.SnakeNLadder.entities.gameBoard.SnakeNLadderBoard;

import java.util.Deque;
import java.util.Random;

public class SnakeNLadder extends Games {

    Random random;
    Deque<Player> players;
    int dice;
    SnakeNLadderBoard snakeNLadderBoard;

    public SnakeNLadder(int N, int snake, int ladder, int dice, Deque<Player> players) {
        this.random = new Random();
        this.dice = dice;
        this.players = players;
        this.snakeNLadderBoard = new SnakeNLadderBoard(N, snake, ladder);
    }

    @Override
    public void startGame() {
        System.out.println("Beginning Game!!!");
        while (true) {
            Player player = players.getFirst();
            int newPosition = player.getCurrPosition() + random.nextInt(1, dice+1);
            if (newPosition >= 100) continue;
            if (newPosition==99) {
                System.out.printf("Player turn: %s, current position: %s, new position %s\n",
                        player.getName(), player.getCurrPosition(), newPosition);
                System.out.printf("Game over: Winner is %s\n", player.getName());
                break;
            }

            Cell cell = snakeNLadderBoard.getCells(newPosition);
            if (cell.getJump()!=null) {
                if (cell.getJump().getStart() > cell.getJump().getEnd()) {
                    System.out.printf("Bit by Snake at start %d and end %d\n",
                            cell.getJump().getStart(), cell.getJump().getEnd());
                } else {
                    System.out.printf("Took Ladder at start %d and end %d\n",
                            cell.getJump().getStart(), cell.getJump().getEnd());
                }
                newPosition = cell.getJump().getEnd();
            }

            System.out.printf("Player turn: %s, current position: %s, new position %s\n",
                    player.getName(), player.getCurrPosition(), newPosition);
            player.setCurrPosition(newPosition);
            nextPlayerTurn();
        }
    }

    private void nextPlayerTurn() {
        players.addLast(players.getFirst());
        players.removeFirst();
    }
}
