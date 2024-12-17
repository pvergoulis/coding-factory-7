package gr.aueb.cf.ch3;

import java.util.Scanner;

public class IsSnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please tell us if it is raining (True/False");
        isRaining = in.nextBoolean();

        System.out.println("Insert the current temperature");
        temp = in.nextInt();


        isSnowing = isRaining && (temp < 0);

        System.out.println("is snowning: " + isSnowing);

    }
}
