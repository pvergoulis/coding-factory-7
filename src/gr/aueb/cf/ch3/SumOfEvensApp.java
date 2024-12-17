package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το αθροισμα των αρτιον απο το 2
 * μεχρι το οριο που δινει ο χρηστης
 */
public class SumOfEvensApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Please insert a num");
        input = in.nextInt();

        while (i <= input) {
            sum += i; // sum = sum + i;
            i += 2;
        }
        System.out.println("The sum of even numbers up to : " + input + " is: " + sum);

    }
}
