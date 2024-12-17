package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ελεγχει αν ο χρηστης εχει το δικαιωμα να ψηθισει
 */
public class VoteEligibleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        final int VOTING_AGE = 18;
        boolean isEligible = false;

        System.out.println("Please insert your age");
        age = in.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.println("Can the user vote : " + isEligible);

    }
}
