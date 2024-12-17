package gr.aueb.cf.exercise;

import java.util.Scanner;

public class TempCheckPract{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBellowZero;

        System.out.println("Please insert the current temperature ");
        temp = in.nextInt();
        isTempBellowZero = temp < 0;

        System.out.println("Is the current temperature  bellow zero?  " + isTempBellowZero);
    }

}

