package gr.aueb.cf.exercise;

import java.util.Scanner;

public class SnowingExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int tem = 0;

        System.out.println("Please insert if is raining (True/False)");
        isRaining = in.nextBoolean();
        System.out.println("Please insert if is temperature(int)");
        tem = in.nextInt();
        isSnowing = isRaining && (tem < 0);

        System.out.printf("Is snowing : ", isSnowing);



    }
}
