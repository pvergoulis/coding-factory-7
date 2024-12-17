package gr.aueb.cf.exercise;

import java.util.Scanner;

public class FindMaxApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int max;

        System.out.println("Please insert 3 integers");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();


        max = findMax( a, b, c);

        System.out.println( max);
    }

    public static int findMax(int a, int b, int c){

        return Math.max(a, Math.max(b, c));

    }
}
