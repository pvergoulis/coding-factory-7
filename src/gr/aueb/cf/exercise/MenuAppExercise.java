package gr.aueb.cf.exercise;

import java.util.Scanner;

public class MenuAppExercise {

    public static void main(String[] args) {
        int choice;
        Scanner in = new Scanner(System.in);

        do {
            printMenu();
            choice = in.nextInt();

            if (!isChoiceValid(choice)){
                System.out.println("Error.choice not valid");
                continue;
            }
            doOnChoice(choice);

        }while (choice != 5);

    }
    public static void printMenu(){

        System.out.println("Επιλεξτε ενα απο τα ακολουθα");
        System.out.println("1. Εισαγωγη");
        System.out.println("2. Διαγραφη");
        System.out.println("3. Αναζητηση");
        System.out.println("4. Ενημερωση");
        System.out.println("5. Εξοδος");
    }

    public static boolean isChoiceValid(int choice){
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice (int choice) {
        switch (choice){
            case 1:
                System.out.println("Εισαγωγη process");
                break;
            case 2:
                System.out.println("Διαγραφη process");
                break;
            case 3:
                System.out.println("Αναζητηση process");
                break;
            case 4:
                System.out.println("Ενημερωση process");
                break;
            case 5:
                System.out.println("Εξοδος process");
                break;
            default:
                System.out.println("Λαθος επιλογη");
                break;
        }
    }
}
