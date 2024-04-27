package LLD.TicTacToe.entities.boards;

import LLD.TicTacToe.entities.Cell;
import LLD.TicTacToe.entities.Piece;
import LLD.TicTacToe.entities.PieceType;

import java.util.HashMap;

public class TicTacToeBoard extends Board {

    Cell[][] cells;
    int N;
    HashMap<Integer, HashMap<PieceType, Integer>> countRowPieceType;
    HashMap<Integer, HashMap<PieceType, Integer>> countColPieceType;
    HashMap<PieceType, Integer> leftDiagonalPieceType;
    HashMap<PieceType, Integer> rightDiagonalPieceType;

    public TicTacToeBoard(int N) {
        this.N = N;
        cells = new Cell[N][N];
        initBoard();
        initGameState();
    }

    private void initBoard() {
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j)
                cells[i][j] = new Cell(null);
    }

    private void initGameState() {
        countRowPieceType = new HashMap<>();
        countColPieceType = new HashMap<>();
        leftDiagonalPieceType = new HashMap<>();
        rightDiagonalPieceType = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            countRowPieceType.put(i, new HashMap<>());
            countColPieceType.put(i, new HashMap<>());
        }
    }

    public void printBoard() {
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                Piece piece = cells[i][j].getPiece();
                System.out.printf(piece == null ? "* " : String.valueOf(piece.getPieceType() + " "));
            }
            System.out.println();
        }
    }

    public Cell getCell(int i, int j) {
        return cells[i][j];
    }

    public void updateBoard(PieceType pieceType, int x, int y) {
        countRowPieceType.get(x).put(pieceType, countRowPieceType.get(x).getOrDefault(pieceType, 0) + 1);
        countColPieceType.get(y).put(pieceType, countColPieceType.get(y).getOrDefault(pieceType, 0) + 1);
        if (x == y)
            leftDiagonalPieceType.put(pieceType, leftDiagonalPieceType.getOrDefault(pieceType, 0) + 1);
        if (x + y + 1 == N)
            rightDiagonalPieceType.put(pieceType, rightDiagonalPieceType.getOrDefault(pieceType, 0) + 1);
    }

    public boolean isWinningMove(PieceType pieceType, int x, int y) {
        return countRowPieceType.get(x).getOrDefault(pieceType, 0) == N ||
                countColPieceType.get(y).getOrDefault(pieceType, 0) == N ||
                leftDiagonalPieceType.getOrDefault(pieceType, 0) == N ||
                rightDiagonalPieceType.getOrDefault(pieceType, 0) == N;
    }
}
