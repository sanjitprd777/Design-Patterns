package LLD.SnakeNLadder;

import LLD.SnakeNLadder.entities.Board;
import LLD.SnakeNLadder.entities.Cell;
import LLD.SnakeNLadder.entities.Jump;
import LLD.SnakeNLadder.entities.Player;

import java.util.Deque;
import java.util.Random;

public class Game {

    private Board board;
    private int dice;
    private Deque<Player> players;
    Random random = new Random();

    public Game(int N, int snake, int ladder, int dice, Deque<Player> players) {
        this.board = new Board(N);
        this.dice = dice;
        this.players = players;
        addSnake(N, snake);
        addLadder(N, ladder);
        validateBoard(N);
    }

    private void validateBoard(int N) {
        for (int i=0;i<N*N;++i) {
            Cell cell = board.getCells(i);
            assert cell.getJump() == null || cell.getJump().getStart() != cell.getJump().getEnd();
        }
    }

    private void addSnake(int N, int snake) {
        while (snake > 0) {
            int start = random.nextInt(1,N*N-1);
            int end = random.nextInt(1,N*N-1);

            if (start <= end)
                continue;

            Jump jump = new Jump(start, end);
            Cell startCell = board.getCells(start);
            Cell endCell = board.getCells(end);

            // Cell start should be free to take snake and cell end should not contain ladder which is coming start again.
            if (startCell.getJump() != null || (endCell.getJump() != null && endCell.getJump().getEnd()==start))
                continue;

            startCell.setJump(jump);
            snake--;
        }

        printSnake(N);
    }

    private void addLadder(int N, int ladder) {
        while (ladder > 0) {
            int start = random.nextInt(1,N*N-1);
            int end = random.nextInt(1,N*N-1);

            if (start >= end)
                continue;

            Jump jump = new Jump(start, end);
            Cell startCell = board.getCells(start);
            Cell endCell = board.getCells(end);

            // Cell start should be free to take snake and cell end should not contain ladder which is coming start again.
            if (startCell.getJump() != null || (endCell.getJump() != null && endCell.getJump().getEnd()==start))
                continue;

            startCell.setJump(jump);
            ladder--;
        }

        printLadder(N);
    }

    public void printSnake(int N) {
        for (int i=0;i<N*N;++i) {
            Cell cell = board.getCells(i);
            if (cell.getJump()!=null && cell.getJump().getStart()>cell.getJump().getEnd()) {
                System.out.printf("Snake position: start %d and end %d\n", cell.getJump().getStart(), cell.getJump().getEnd());
            }
        }
    }

    public void printLadder(int N) {
        for (int i=0;i<N*N;++i) {
            Cell cell = board.getCells(i);
            if (cell.getJump()!=null && cell.getJump().getStart()<cell.getJump().getEnd()) {
                System.out.printf("Ladder position: start %d and end %d\n", cell.getJump().getStart(), cell.getJump().getEnd());
            }
        }
    }

    public void startGame() {
        System.out.println("Beginning Game!!!");
        while (true) {
            Player player = players.getFirst();
            int newPosition = player.getCurrPosition() + random.nextInt(1, dice+1);
            if (newPosition >= 100) continue;
            if (newPosition==99) {
                System.out.printf("Player turn: %s, current position: %s, new position %s\n", player.getName(), player.getCurrPosition(), newPosition);
                System.out.printf("Game over: Winner is %s\n", player.getName());
                break;
            }

            Cell cell = board.getCells(newPosition);
            if (cell.getJump()!=null) {
                if (cell.getJump().getStart() > cell.getJump().getEnd())
                    System.out.printf("Bit by Snake at start %d and end %d\n", cell.getJump().getStart(), cell.getJump().getEnd());
                else
                    System.out.printf("Took Ladder at start %d and end %d\n", cell.getJump().getStart(), cell.getJump().getEnd());
                newPosition = cell.getJump().getEnd();
            }

            System.out.printf("Player turn: %s, current position: %s, new position %s\n", player.getName(), player.getCurrPosition(), newPosition);
            player.setCurrPosition(newPosition);
            nextPlayerTurn();
        }
    }

    private void nextPlayerTurn() {
        players.addLast(players.getFirst());
        players.removeFirst();
    }
}
