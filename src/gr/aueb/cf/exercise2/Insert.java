package gr.aueb.cf.exercise2;

import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Δημιουργία πίνακα 6 θέσεων
        int[] array = new int[6];

        // Είσοδος τιμών από τον χρήστη
        System.out.println("Δώστε 6 ακέραιες τιμές:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Τιμή για θέση " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Εμφάνιση τιμών που εισήχθησαν
        System.out.println("Οι τιμές που εισάγατε είναι:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Θέση " + i + ": " + array[i]);
        }
    }
}
