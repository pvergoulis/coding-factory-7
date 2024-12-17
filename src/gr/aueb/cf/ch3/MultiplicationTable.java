package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δινει εως output τον πολλαπλασιαμο ενος ακεραιου
 * που του δινει ο χρηστης με ολους τους ακεραιους απο 1 εως 10.
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;

        System.out.println("Please insert a num");
        inputNum = in.nextInt();

        while (i <=10) {
            System.out.println(inputNum + " * " + i + " = "+ (inputNum * i));
            i++;
        }
    }
}
