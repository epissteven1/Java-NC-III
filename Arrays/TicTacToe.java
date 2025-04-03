package Arrays;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        boolean isGameOver = false;
        int moves = 0;
        char currentPlayer = 'X';

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Tic-Tac-Toe Game");

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    board[i][j] = '_';
                }
            }

            while (!isGameOver) {
                printBoard(board);
                System.out.print("Player " + currentPlayer + ", enter row and column: ");
                int row = scanner.nextInt() - 1;
                int col = scanner.nextInt() - 1;

                if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '_') {
                    System.out.println("Invalid move. Try again.");
                    continue;
                }

                board[row][col] = currentPlayer;
                moves++;

                if (checkWinner(board, currentPlayer)) {
                    printBoard(board);
                    System.out.println("Player " + currentPlayer + " wins!");
                    isGameOver = true;
                } else if (moves == 9) {
                    printBoard(board);
                    System.out.println("It's a draw!");
                    isGameOver = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            }
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println("  1 2 3");
        for (int i = 0; i < board.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkWinner(char[][] board, char player) {

        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }
}
