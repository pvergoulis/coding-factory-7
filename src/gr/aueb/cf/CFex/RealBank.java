package gr.aueb.cf.CFex;

import java.util.Scanner;
import java.util.InputMismatchException;

public class RealBank {
    static int balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int amount;

        do {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Exit");

            try {
                choice = in.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Please enter withdrawal amount");
                        try {
                            amount = in.nextInt();
                            if (amount <= 0) {
                                throw new ArithmeticException("Amount must be positive.");
                            }
                            if (amount <= balance) {
                                balance = balance - amount;
                                System.out.println("Your new Balance is: " + balance);
                                System.out.println("Would you like to continue?");
                            } else {
                                System.out.println("Insufficient funds.");
                                System.out.println("Try Again..");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            in.nextLine();
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.println("Please enter deposit amount");
                        try {
                            amount = in.nextInt();
                            if (amount <= 0) {
                                throw new ArithmeticException("Amount must be positive.");
                            }
                            balance = balance + amount;
                            System.out.println("Your new balance is: " + balance);
                            System.out.println("Would you like to continue?");
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            in.nextLine();
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 3:
                        System.out.println("Exit..Thanks for using our app");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice. Please enter a valid number.");
                in.nextLine();
            }
        } while (choice != 3);
    }
}


