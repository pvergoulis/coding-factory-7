package gr.aueb.cf.CFex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradesWithMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int java = 0;
        int web = 0;
        int sql = 0;
        int average;

        while (true) {
            try {

                java = getGrade(in, "Java");
                printGradeMessage(java);

                web = getGrade(in, "Web");
                printGradeMessage(web);

                sql = getGrade(in, "SQL");
                printGradeMessage(sql);

                average = (java + web + sql) / 3;
                System.out.println("Your average: " + average);
                break;

            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a number between 0 and 10.");
                in.nextLine();
            }
        }
    }


    public static int getGrade(Scanner in, String subject) {
        int grade;
        do {
            System.out.println("Please insert your " + subject + " grade (0-10):");
            grade = in.nextInt();
            if (grade < 0 || grade > 10) {
                System.out.println("Grade must be between 0 and 10.");
            }
        } while (grade < 0 || grade > 10);
        return grade;
    }


    public static void printGradeMessage(int grade) {
        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                 System.out.println("You have failed");
                 break;
            case 5:
            case 6:
                 System.out.println("Barely Passed");
                 break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                 System.out.println("Excellent");
                 break;
        }
    }
}
