package gr.aueb.cf.exercise;

import java.util.Scanner;

public class EuroToUsd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputEuro = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        System.out.println("Please insert an integer (Euro)");
        inputEuro = in.nextInt();

        totalUsaCents = inputEuro * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d \u20AC = %d \u0024, %d usa cents", inputEuro, usaDollars, usaCents);
    }
}