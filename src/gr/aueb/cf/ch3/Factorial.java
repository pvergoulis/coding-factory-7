package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;
        int facto = 1;

        System.out.println("Please insert a num");
        inputNum = in.nextInt();

        while (inputNum >= i) {
            facto = facto * i;
            i++;
        }
        System.out.println("facto " + facto);
    }
}
