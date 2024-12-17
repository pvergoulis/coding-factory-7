package gr.aueb.cf.exercise;

import java.util.Scanner;

public class MultiplicationTablePractise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;

        System.out.println("Insert a num");
        inputNum = in.nextInt();

        while (i <= 10){
            System.out.println(inputNum + " * " + i + " = "+ (inputNum * i));
            i++;
        }
    }
}
