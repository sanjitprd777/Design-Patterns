package LLD.ChessValidator.boards;

import LLD.ChessValidator.behavior.*;
import LLD.ChessValidator.entities.Cell;
import LLD.ChessValidator.entities.Piece;
import LLD.ChessValidator.entities.PieceType;

import java.util.HashMap;

public class ChessBoard implements Board {

    private final Cell[][] cell;
    private final int size;
    private final HashMap<String, Cell> cellMap;
    private final HashMap<String, Integer[]> cellGridMap;

    public ChessBoard(int size) {
        this.size = size;
        this.cellMap = new HashMap<>();
        this.cellGridMap = new HashMap<>();
        cell = new Cell[size][size];
        initBoard();
    }

    public Cell getCell(String cellPos) {
        return cellMap.getOrDefault(cellPos, null);
    }

    public Integer[] getCellCord(String cellPos) {
        return cellGridMap.getOrDefault(cellPos, null);
    }

    @Override
    public void initBoard() {
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                // Add all the initial pieces at initial positions.
                cell[i][j] = new Cell(new Piece(PieceType.N, null));

                if (i == 0) {
                    if (j == 0 || j == size - 1) cell[i][j] = new Cell(new Piece(PieceType.BR, new Rook()));
                    if (j == 1 || j == size - 2) cell[i][j] = new Cell(new Piece(PieceType.BN, new Knight()));
                    if (j == 2 || j == size - 3) cell[i][j] = new Cell(new Piece(PieceType.BB, new Bishop()));
                    if (j == 3) cell[i][j] = new Cell(new Piece(PieceType.BQ, new Queen()));
                    if (j == 4) cell[i][j] = new Cell(new Piece(PieceType.BK, new King()));
                }
                if (i == 1) cell[i][j] = new Cell(new Piece(PieceType.BP, new Pawn()));

                if (i == size - 1) {
                    if (j == 0 || j == size - 1) cell[i][j] = new Cell(new Piece(PieceType.WR, new Rook()));
                    if (j == 1 || j == size - 2) cell[i][j] = new Cell(new Piece(PieceType.WN, new Knight()));
                    if (j == 2 || j == size - 3) cell[i][j] = new Cell(new Piece(PieceType.WB, new Bishop()));
                    if (j == 3) cell[i][j] = new Cell(new Piece(PieceType.WQ, new Queen()));
                    if (j == 4) cell[i][j] = new Cell(new Piece(PieceType.WK, new King()));
                }
                if (i == size - 2) cell[i][j] = new Cell(new Piece(PieceType.WP, new Pawn()));

                // Update cell hashmap.
                String key = Character.toString('a'+j) + (size-i);
                cellMap.put(key, cell[i][j]);
                cellGridMap.put(key, new Integer[]{i, j});
            }
        }
    }

    @Override
    public void printBoard() {
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                // Add all the initial pieces at initial positions.
                if (!PieceType.N.equals(cell[i][j].getPiece().getPieceType()))
                    System.out.printf(cell[i][j].getPiece().getPieceType().getValue());
                else
                    System.out.print("--");
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
