package gr.aueb.cf.CFex;

import java.util.Scanner;
import java.util.InputMismatchException;

public class BankApp2 {
    static int balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice=0;

        while (true){
            try {
                printMenu();
                choice = in.nextInt();

                switch (choice){
                    case 1:
                        depositAmount();
                        break;
                    case 2:
                        withdrawAmount();
                        break;
                    case 3:
                        System.out.println("Thanks for using our app");
                        System.exit(choice);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

            }catch (InputMismatchException e){
                System.err.println("Try again.. You must enter a number");
            }
        }

    }

    public static void printMenu(){
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Exit");
    }

    public static void depositAmount(){
        try {
            System.out.println("Enter deposit amount");
            int amount = in.nextInt();
            if (amount <= 0){
                throw new ArithmeticException("Amount must not be negative");
            }
            balance += amount;
            System.out.println("Your new balance is: " + balance);
        }catch (InputMismatchException e){
            System.err.println("Invalid input. Please enter a number");
            in.nextLine();
        }catch (ArithmeticException e){
            System.err.println("Error."+ e.getMessage());
        }
    }

    public static void withdrawAmount(){
        try {
            System.out.println("Please enter withdraw amount");
            int amount = in.nextInt();
            if (amount <=0 || amount > balance){
                throw new ArithmeticException("Amount must not be zero or higher than your current balance");
            }
            balance -= amount;
            System.out.println("Your current balance is: " + balance);
        }catch (InputMismatchException e){
            System.err.println("Invalid input. Please enter a number");
            in.nextLine();
        }catch (ArithmeticException e){
            System.err.println("Error "+e.getMessage());
        }
    }

}