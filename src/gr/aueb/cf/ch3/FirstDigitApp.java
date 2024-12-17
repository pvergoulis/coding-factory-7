package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρισκει το πρωτο αρριστερα ψηφιο ενος αριθμου
 */
public class FirstDigitApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;

        System.out.println("Please insert a positive num");
        inputNum = in.nextInt();

        tempNum = inputNum;

        while (tempNum >= 10){
            tempNum /=10; //tempNum = tempNum / 10;
        }
        System.out.println("The first digit of " + inputNum + " is " + tempNum);

    }
}
