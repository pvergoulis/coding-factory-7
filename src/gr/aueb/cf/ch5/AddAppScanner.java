package gr.aueb.cf.ch5;

import java.util.Scanner;

public class AddAppScanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b =0;
        int sum = 0;
        int sub = 0;

        System.out.println("Please insert two integers");
        a = in.nextInt();
        b = in.nextInt();

        sum = add(a, b);
        sub = sub(a, b);

        System.out.println("The sum is: "+ sum);
        System.out.println("The sub is: "+ sub);


    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
