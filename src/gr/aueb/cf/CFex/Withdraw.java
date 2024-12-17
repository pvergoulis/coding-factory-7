package gr.aueb.cf.CFex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Withdraw {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int balance = 600;
        int amount = 0;

        try {
            System.out.println("Εισαγετε το ποσο αναληψης");
            amount = in.nextInt();
            if (amount > balance) {
                System.out.println("You dont have that money");
                return;
            }

            balance = balance - amount;
            System.out.println("You balance is: " + balance);
        }catch (ArithmeticException e){
            System.err.println("You dont have that amount");
        } catch (InputMismatchException e){
            System.out.println("Invalid Input.Please enter a valid number.");
        }

        System.out.println("Thanks you");
    }
}
