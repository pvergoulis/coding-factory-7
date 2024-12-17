package gr.aueb.cf.exercise;

import java.util.Scanner;

public class DegitSumPractice {

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int rightDigit = 0;
    int leftDigit = 0;
    int inputNum = 0;
    int sum = 0;

        System.out.println("insert a two integer");
        inputNum = in.nextInt();
        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        sum = leftDigit + rightDigit;

        System.out.printf("left digit is %d, right Digit is %d, sum is %d", leftDigit, rightDigit, sum);

    }
}
