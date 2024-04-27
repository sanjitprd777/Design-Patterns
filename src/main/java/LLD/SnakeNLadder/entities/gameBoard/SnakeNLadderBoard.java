package LLD.SnakeNLadder.entities.gameBoard;

import LLD.SnakeNLadder.entities.Cell;
import LLD.SnakeNLadder.entities.Jump;

import java.util.Random;

public class SnakeNLadderBoard extends Boards {

    Random random;
    private final Cell[] cells;

    public SnakeNLadderBoard(int N, int snake, int ladder) {
        cells = new Cell[N*N];
        for (int i=0;i<N*N; ++i)
            cells[i] = new Cell(null);
        random = new Random();
        addSnake(N, snake);
        addLadder(N, ladder);
        validateBoard(N);
    }

    public Cell getCells(int i) {
        return cells[i];
    }

    private void validateBoard(int N) {
        for (int i=0;i<N*N;++i) {
            Cell cell = cells[i];
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
            Cell startCell = cells[start];
            Cell endCell = cells[end];

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
            Cell startCell = cells[start];
            Cell endCell = cells[end];

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
            Cell cell = cells[i];
            if (cell.getJump()!=null && cell.getJump().getStart()>cell.getJump().getEnd()) {
                System.out.printf("Snake position: start %d and end %d\n", cell.getJump().getStart(), cell.getJump().getEnd());
            }
        }
    }

    public void printLadder(int N) {
        for (int i=0;i<N*N;++i) {
            Cell cell = cells[i];
            if (cell.getJump()!=null && cell.getJump().getStart()<cell.getJump().getEnd()) {
                System.out.printf("Ladder position: start %d and end %d\n", cell.getJump().getStart(), cell.getJump().getEnd());
            }
        }
    }
}
