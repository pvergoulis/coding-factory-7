package gr.aueb.cf.christmasProjects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectFour {

    public static void main(String[] args) {
        char[][] board = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char currentPlayer = 'X';
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;


        while (true) {
            printBoard(board);
            System.out.println("Παικτης " + currentPlayer + ", εισαγετε τη σειρα και τη στηλη (0-2): ");

            try {
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-') {
                    System.out.println("Μη εγκυρη κινηση. Δοκιμαστε ξανα.");
                } else {
                    board[row][col] = currentPlayer;
                    if (checkWin(board, currentPlayer)) {
                        printBoard(board);
                        System.out.println("Ο παικτης " + currentPlayer + " κερδισε!");
                        break;
                    } else if (isBoardFull(board)) {
                        printBoard(board);
                        System.out.println("Ισοπαλια");
                        break;
                    } else {
                        if (currentPlayer == 'X') {
                            currentPlayer = 'O';
                        } else {
                            currentPlayer = 'X';
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error.  Εισαγετε εγκυρους αριθμους για τη σειρα και τη στηλη.");
                scanner.next();
            }
        }

        scanner.close();
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkWin(char[][] board, char player) {
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

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
