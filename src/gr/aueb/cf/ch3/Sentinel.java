package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the positives count , given by the user.
 */
public class Sentinel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int positivesCount = 0;

        System.out.println("Please insert a num");
        inputNum = in.nextInt();

        while (inputNum >= 0) {
            positivesCount++;
            System.out.println("Please insert a num");
            inputNum = in.nextInt();
        }
        System.out.println("Sum of Positive: " + positivesCount);
    }
}
