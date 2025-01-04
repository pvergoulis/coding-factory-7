package gr.aueb.cf.christmasProjects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectFive {

    public static void main(String[] args) {
        boolean[][] theaterSeats = new boolean[30][12];
        Scanner in = new Scanner(System.in);
        char col ;
        int row ;
        int choice = 0;

        while (true) {
            System.out.println("1. Καντε κρατηση θεσης");
            System.out.println("2. Ακυρωστε κρατηση θεσης");
            System.out.println("3. Εξοδος");

            try {
                choice = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error. Εισαγετε εγκυρο αριθμο.");
                in.next();
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Εισαγετε στηλη απο A εως L: ");
                            col = in.next().charAt(0);
                            if (col < 'A' || col > 'L') throw new IllegalArgumentException("Μη εγκυρη στηλη.");
                        } catch (InputMismatchException | IllegalArgumentException e) {
                            System.err.println("Error: " + e.getMessage());
                            continue;
                        }

                        try {
                            System.out.print("Εισαγετε σειρα (1-30): ");
                            row = in.nextInt();
                            if (row < 1 || row > 30) throw new IllegalArgumentException("Μη εγκυρη σειρα.");
                        } catch (InputMismatchException | IllegalArgumentException e) {
                            System.err.println("Error: " + e.getMessage());
                            in.next();
                            continue;
                        }

                        book(theaterSeats, col, row);
                        break;

                    case 2:
                        try {
                            System.out.print("Εισαγετε στηλη απο A εως L: ");
                            col = in.next().charAt(0);
                            if (col < 'A' || col > 'L') throw new IllegalArgumentException("Μη εγκυρη στηλη.");
                        } catch (InputMismatchException | IllegalArgumentException e) {
                            System.err.println("Error: " + e.getMessage());
                            continue;
                        }

                        try {
                            System.out.print("Εισαγετε σειρα (1-30): ");
                            row = in.nextInt();
                            if (row < 1 || row > 30) throw new IllegalArgumentException("Μη εγκυρη σειρα.");
                        } catch (InputMismatchException | IllegalArgumentException e) {
                            System.err.println("Error: " + e.getMessage());
                            in.next();
                            continue;
                        }

                        cancel(theaterSeats, col, row);
                        break;

                    case 3:
                        System.out.println("Εξοδος...");
                        in.close();
                        return;

                    default:
                        System.out.println("Μη έγκυρη επιλογή. Δοκιμάστε ξανά.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    public static void book(boolean[][] seats, char column, int row) {
        int colIndex = column - 'A';
        int rowIndex = row - 1;

        if (isValidPosition(colIndex, rowIndex)) {
            if (seats[rowIndex][colIndex]) {
                System.out.println("Η θεση " + column + row + " είναι κρατημενη.");
            } else {
                seats[rowIndex][colIndex] = true;
                System.out.println("Η θεση " + column + row + " κρατηθηκε επιτυχως.");
            }
        } else {
            System.out.println("Μη εγκυρη θηση. Δοκιμαστε ξανα.");
        }
    }

    public static void cancel(boolean[][] seats, char column, int row) {
        int colIndex = column - 'A';
        int rowIndex = row - 1;

        if (isValidPosition(colIndex, rowIndex)) {
            if (seats[rowIndex][colIndex]) {
                seats[rowIndex][colIndex] = false;
                System.out.println("Η κρατηση της θεσης " + column + row + " ακυρωθηκε.");
            } else {
                System.out.println("Η θεση " + column + row + " δεν ειναι κρατημενη.");
            }
        } else {
            System.out.println("Μη εγκυρη θεση. Δοκιμαστε ξανα.");
        }
    }

    public static boolean isValidPosition(int colIndex, int rowIndex) {
        return colIndex >= 0 && colIndex < 12 && rowIndex >= 0 && rowIndex < 30;
    }
}
