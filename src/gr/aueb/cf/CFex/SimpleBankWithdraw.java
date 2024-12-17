package gr.aueb.cf.CFex;

import java.util.Scanner;

public class SimpleBankWithdraw {
    static double balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            withdraw(400);
            System.out.println("Your remaining balance is : "+ balance);
        }catch (Exception e){
            System.out.println("An Error happened try again");
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
