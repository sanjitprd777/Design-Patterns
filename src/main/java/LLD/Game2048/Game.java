package LLD.Game2048;

import LLD.Game2048.entities.Board;
import LLD.Game2048.entities.Cell;
import LLD.Game2048.entities.Value;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private final Random random;

    Board board;
    int N;
    int base;
    int winningValue;

    public Game(int N, int base, int winningValue) {
        this.N = N;
        this.base = base;
        this.winningValue = winningValue;
        random = new Random();
        board = new Board(N);
        fillBoard();
    }

    private void fillBoard() {
        int seedValues = 3;
        while (seedValues > 0) {
            int row = random.nextInt(N);
            int col = random.nextInt(N);

            Cell cell = board.getCell(row, col);
            if (cell.getValue()!=null) continue;
            cell.setValue(new Value(2));
            seedValues--;
        }
    }

    public void startGame() {
        // Flag to hold a value if any cell has moved from the original position.
        while (true) {
            if (board.printBoard(winningValue)) {
                System.out.println("Game Won!!!");
                break;
            }
            else if (!board.hasFreeCells()) {
                System.out.println("Game over!!! No more valid moves left");
                break;
            }
            System.out.println("0 (left), 1 (right), 2 (top), 3 (bottom)");
            Scanner sc = new Scanner(System.in);
            int move = sc.nextInt();
            switch (move) {
                case 0: {
                    board.moveLeft();
                    break;
                }
                case 1: {
                    board.moveRight();
                    break;
                }
                case 2: {
                    board.moveUp();
                    break;
                }
                case 3: {
                    board.moveDown();
                    break;
                }
                default: {
                    System.out.println("Invalid move, try again!!!");
                }
            }
        }
    }
}
