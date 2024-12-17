package gr.aueb.cf.exercise;

import java.util.Scanner;

/**
 * Turn light on, if it is raining and car is running > 100 or
 * is dark
 */
public class LightOnExercise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX_SPEED = 100;
        boolean lightsOn = false;
        boolean isRaining = false;
        boolean isDark = false;
        int carSpeed = 0;

        System.out.println("Please tell us if it is dark (True/False)");
        isDark = in.nextBoolean();

        System.out.println("Please tell us if it is raining (True/False)");
        isRaining = in.nextBoolean();

        System.out.println("Insert the current speed");
        carSpeed = in.nextInt();


        lightsOn = isRaining && isDark || carSpeed > MAX_SPEED;

        System.out.println("You should turn the lights: " + lightsOn);

    }
}
