package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert numerator (Quit when Numerator is zero ");
            numerator = in.nextInt();

            if (numerator == 0) {
                System.out.println("Numenator is zero..Quiting");
                break;
            }

            System.out.println("Please insert denominator");
            denominator = in.nextInt();

            if (denominator == 0) {
                System.out.println("Denominator must not be zero");
                continue;
            }

            result = numerator / denominator;

            System.out.println("The result: " + result);
        }
    }
}
