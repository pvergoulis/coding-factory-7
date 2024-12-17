package gr.aueb.cf.exercise;

import java.util.Scanner;

public class SecPerDaysPra {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
       final int SEC_PER_DAYS = 3600 *24;
       final int SEC_PER_HOURS = 3600;
       final int SEC_PER_MINS = 60;
       int days = 0;
       int hours = 0;
       int mins = 0;
       int seconds = 0;
       int totalSecs = 0;

        System.out.println("Please insert Days, Hours, Minutes and Seconds");
        days = in.nextInt();
        hours = in.nextInt();
        mins = in.nextInt();
        seconds = in.nextInt();
        totalSecs = days * SEC_PER_DAYS + hours * SEC_PER_HOURS + mins * SEC_PER_MINS + seconds;

        System.out.printf("%d days + %d hours + %d minutes + %d seconds : %,d ",days, hours, mins, seconds, totalSecs);

    }



}
