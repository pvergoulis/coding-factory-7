package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates the sum of two integers
 * by using methods
 */
public class AddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 10;
        int b = 5;
        int sum = 0;
        int sub = 0;


        sum = add(a, b);
        sub = sub(a, b);
        System.out.println(sum);
        System.out.println(sub);
    }

    /**
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */

    public static int add(int a,int b){
//        int result = 0;
//
//        result = a + b;
//
//        return result;

        return a + b;
    }

    public static int sub(int a,int b){

        return a - b;

    }
}
