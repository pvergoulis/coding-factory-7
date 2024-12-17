package gr.aueb.cf.exercise;

import java.util.Scanner;

public class PositiveCountExer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        int positiveCount = 0;

        System.out.println("Please insert a num");
        input = in.nextInt();

        while (input >= 0) {
            positiveCount++;
            System.out.println("Please insert a num");
            input = in.nextInt();
        }
        System.out.println("final counts:" + positiveCount);
    }
}
