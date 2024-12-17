package gr.aueb.cf.ch2;

import java.util.Scanner;

public class YearsToDays {

    public static void main(String[] args) {
        final  int DAYS_PER_YEARS = 365;
        int age = 0;
        int days = 0;
        Scanner in = new Scanner(System.in);


        System.out.println("Please insert you age");
        age = in.nextInt();

        days = age * DAYS_PER_YEARS;

        System.out.println("Age in years: " + age + ", Age in days: " + days);
    }
}
