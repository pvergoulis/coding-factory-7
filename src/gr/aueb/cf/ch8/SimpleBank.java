package gr.aueb.cf.ch8;

import java.util.Scanner;

public class SimpleBank {
    static double balance = 500;
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        try {
            deposit(1000);
            System.out.println(balance);
        }catch (Exception e){
            System.out.println("An Error happened try again");
        }
    }

    public static void deposit(double amount){
        try {
            if (amount <= 0 ){
                throw new IllegalArgumentException("Amount must be positive");
            }
            balance += amount;
            System.out.println("Successfully deposited " + amount);
        }catch (IllegalArgumentException e){
            System.err.println("Error. "+ e.getMessage());
            throw e;
        }


    }

    public static void withdraw(double amount){
        try {
            if(amount > 500){
                throw new IllegalArgumentException("You dont have that amount in your bank acount");

            }
            balance -= amount;
            System.out.println("Successfully ");
        } catch (IllegalArgumentException e){
            System.err.println("Error.."+ e.getMessage());
            throw e;
        }
    }
}
