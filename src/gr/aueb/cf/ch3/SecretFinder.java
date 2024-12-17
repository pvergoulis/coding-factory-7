package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final  int SECRET = 12;


        System.out.println("Please insert a num to guess to the Secret");
        num = in.nextInt();

        if (num == SECRET) {
            System.out.println("You have found the Secret num!!");
        }else  {
            System.out.println("You have failed...Rerun the program to try again!");
        }
    }
}
