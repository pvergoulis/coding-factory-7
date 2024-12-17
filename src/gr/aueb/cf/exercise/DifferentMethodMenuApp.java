package gr.aueb.cf.exercise;

import java.util.Scanner;

public class DifferentMethodMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  choice;
        do {
            printMenu();
            choice = in.nextInt();

            doOnchoice(choice);

        }while (choice!=5);

    }
    public static void printMenu(){
        System.out.println("Chose one of the following");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.println("4. Search");
        System.out.println("5. Exit");
    }

    public static void doOnchoice(int choice){
        switch (choice){
            case 1:
                System.out.println("Insert process");
                break;
            case 2:
                System.out.println("Delete process");
                break;
            case 3:
                System.out.println("Update process");
            case 4:
                System.out.println("Search process");
                break;
            case 5:
                System.out.println("Exit process");
            default:
                System.out.println("Error..Your choice must be between 1-5");
                break;

        }
    }
}
