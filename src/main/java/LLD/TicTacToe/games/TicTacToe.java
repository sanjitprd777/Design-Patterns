package LLD.TicTacToe.games;

import LLD.TicTacToe.entities.Piece;
import LLD.TicTacToe.entities.Player;
import LLD.TicTacToe.entities.boards.TicTacToeBoard;

import java.util.Deque;
import java.util.Scanner;

public class TicTacToe extends Game {

    int N;
    Deque<Player> players;
    TicTacToeBoard ticTacToeBoard;

    public TicTacToe(Deque<Player> players, int N) {
        this.players = players;
        this.N = N;
        ticTacToeBoard = new TicTacToeBoard(N);
    }

    @Override
    public void startGame() {
        while (true) {
            ticTacToeBoard.printBoard();
            Player player = players.getFirst();
            System.out.printf("Current player turn: %s\n", player.getName());
            System.out.println("Enter cell position as row and column");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (makeMove(player, x, y)) {
                players.removeFirst();
                players.addLast(player);
            } else {
                System.out.println("Invalid move!!! Try again...");
                continue;
            }

            if (isWinner(player, x, y)) {
                System.out.printf("Game Won!!! Winner is %s\n", player.getName());
                break;
            }

            if (!hasMoves()) {
                System.out.println("Game Over!!! No moves left");
                break;
            }
        }
        ticTacToeBoard.printBoard();
    }

    @Override
    public boolean makeMove(Player player, int x, int y) {

        if (ticTacToeBoard.getCell(x, y).getPiece() != null) {
            return false;
        }

        ticTacToeBoard.getCell(x, y).setPiece(new Piece(player.getPiece().getPieceType()));

        // Add a piece to board state
        ticTacToeBoard.updateBoard(player.getPiece().getPieceType(), x, y);
        return true;
    }

    @Override
    public boolean isWinner(Player player, int x, int y) {
        return ticTacToeBoard.isWinningMove(player.getPiece().getPieceType(), x, y);
    }

    @Override
    public boolean hasMoves() {
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (ticTacToeBoard.getCell(i, j).getPiece() == null)
                    return true;
            }
        }
        return false;
    }
}
