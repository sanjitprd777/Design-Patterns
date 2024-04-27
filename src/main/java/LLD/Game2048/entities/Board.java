package LLD.Game2048.entities;

import java.util.Random;

public class Board {

    Cell[][] cell;
    int N;
    private final Random random;

    public Board(int N) {
        this.N = N;
        cell = new Cell[N][N];
        random = new Random();
        initBoard();
    }

    private void initBoard() {
        for (int i=0;i<N;++i)
            for (int j=0;j<N;++j)
                cell[i][j] = new Cell(null);
    }

    public Cell getCell(int i, int j) {
        return cell[i][j];
    }

    public void moveLeft() {
        boolean flag = false;

        // First move then, merge then, move
        for (int i=0;i<N;++i) {
            // Move cells to left edge
            flag |= shiftLeft(i, flag);

            // Merge adjacent cells having same value
            for (int j=1;j<N;++j) {
                Cell cell1 = cell[i][j-1];
                Cell cell2 = cell[i][j];
                flag |= mergeCells(cell1, cell2, flag);
            }
            // Move cells to left edge
            flag |= shiftLeft(i, flag);
        }

        if (flag) addRandomCell();
    }

    public void moveRight() {
        boolean flag = false;

        // First move then, merge then, move
        for (int i=0;i<N;++i) {
            // Move cells to left edge
            flag |= shiftRight(i, flag);

            // Merge adjacent cells having same value
            for (int j=N-2;j>=0;--j) {
                Cell cell1 = cell[i][j+1];
                Cell cell2 = cell[i][j];
                flag |= mergeCells(cell1, cell2, flag);
            }
            // Move cells to left edge
            flag |= shiftRight(i, flag);
        }

        if (flag) addRandomCell();
    }

    public void moveUp() {
        boolean flag = false;

        // First move then, merge then, move
        for (int i=0;i<N;++i) {
            // Move cells to left edge
            flag |= shiftUp(i, flag);

            // Merge adjacent cells having same value
            for (int j=1;j<N;++j) {
                Cell cell1 = cell[j-1][i];
                Cell cell2 = cell[j][i];
                flag |= mergeCells(cell1, cell2, flag);
            }
            // Move cells to left edge
            flag |= shiftUp(i, flag);
        }

        if (flag) addRandomCell();
    }

    public void moveDown() {
        boolean flag = false;

        // First move then, merge then, move
        for (int i=0;i<N;++i) {
            // Move cells to left edge
            flag |= shiftDown(i, flag);

            // Merge adjacent cells having same value
            for (int j=N-2;j>=0;--j) {
                Cell cell1 = cell[j+1][i];
                Cell cell2 = cell[j][i];
                flag |= mergeCells(cell1, cell2, flag);
            }
            // Move cells to left edge
            flag |= shiftDown(i, flag);
        }

        if (flag) addRandomCell();
    }

    private static boolean mergeCells(Cell cell1, Cell cell2, boolean flag) {
        if (cell1.getValue()!=null && cell2.getValue()!=null && cell1.getValue().value== cell2.getValue().value) {
            cell1.setValue(new Value(cell1.getValue().value*2));
            cell2.setValue(null);
            flag = true;
        }
        return flag;
    }

    private boolean shiftLeft(int row, boolean flag) {
        int k=0;
        for (int j=0;j<N;++j) {
            Cell cell1 = cell[row][j];
            if (cell1.getValue()!=null) {
                int val = cell1.getValue().value;
                cell[row][j].setValue(null);
                cell[row][k].setValue(new Value(val));
                if (j!=k)   flag = true;
                k++;
            }
        }
        return flag;
    }

    private boolean shiftRight(int row, boolean flag) {
        int k=N-1;
        for (int j=N-1;j>=0;--j) {
            Cell cell1 = cell[row][j];
            if (cell1.getValue()!=null) {
                int val = cell1.getValue().value;
                cell[row][j].setValue(null);
                cell[row][k].setValue(new Value(val));
                if (j!=k)   flag = true;
                k--;
            }
        }
        return flag;
    }

    private boolean shiftUp(int col, boolean flag) {
        int k=0;
        for (int j=0;j<N;++j) {
            Cell cell1 = cell[j][col];
            if (cell1.getValue()!=null) {
                int val = cell1.getValue().value;
                cell[j][col].setValue(null);
                cell[k][col].setValue(new Value(val));
                if (j!=k)   flag = true;
                k++;
            }
        }
        return flag;
    }

    private boolean shiftDown(int col, boolean flag) {
        int k=N-1;
        for (int j=N-1;j>=0;--j) {
            Cell cell1 = cell[j][col];
            if (cell1.getValue()!=null) {
                int val = cell1.getValue().value;
                cell[j][col].setValue(null);
                cell[k][col].setValue(new Value(val));
                if (j!=k)   flag = true;
                k--;
            }
        }
        return flag;
    }

    private void addRandomCell() {
        while (true) {
            int row = random.nextInt(N);
            int col = random.nextInt(N);
            if (cell[row][col].getValue()==null) {
                System.out.printf("Random cell value inserted at: Row %d and Column %d\n", row, col);
                cell[row][col].setValue(new Value(2));
                break;
            }
        }
    }

    public boolean printBoard(int winningValue) {
        boolean flag2048 = false;
        for (int i=0;i<N;++i) {
            for (int j=0;j<N;++j) {
                int val = cell[i][j].getValue() != null ? cell[i][j].getValue().value : 0;
                System.out.printf("%d     ", val);
                flag2048 |= (val == winningValue);
            }
            System.out.println();
        }
        return flag2048;
    }

    public boolean hasFreeCells() {
        for (int i=0;i<N;++i) {
            for (int j=0;j<N;++j) {
                if (cell[i][j].getValue() == null)
                    return true;
            }
        }
        return false;
    }
}
