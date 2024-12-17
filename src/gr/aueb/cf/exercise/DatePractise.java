package gr.aueb.cf.exercise;

import java.util.Scanner;

public class DatePractise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Insert your birthday (day, month, year)");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("You were born on: %02d/%02d/%d", day, month, year);


    }
}
