package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * 153 = 1^3 + 5^3 + 3^3
 */
public class ArmStrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;
        int numberOfDigits;
        int originalNum;

        System.out.println("Enter a number");
        num = in.nextInt();
        originalNum = num;

        while (num > 0) {
            numberOfDigits  = num % 10;
            sum += numberOfDigits * numberOfDigits * numberOfDigits;
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " είναι Armstrong ");
        } else {
            System.out.println(originalNum + " δεν είναι Armstrong ");
        }
    }

}

