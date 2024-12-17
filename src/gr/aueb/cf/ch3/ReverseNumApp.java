package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αντιστρεφει τον αριθμο που  δινει ο χρηστης.
 * Για παραδηγμα 123 το δινει 321.
 */
public class ReverseNumApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int tempNum = 0;
        int reversed = 0;
        int rightDigit = 0;

        System.out.println("Please insert a posivite integer");
        num = in.nextInt();


        tempNum = num;

        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            reversed = reversed * 10 + rightDigit;
            tempNum /= 10;  //tempNum = tempNum / 10;
        }

        System.out.println("The reversed num is: " + reversed);
    }
}
