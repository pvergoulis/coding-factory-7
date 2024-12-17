package gr.aueb.cf.CFex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        int result = 0;
        int choice;

            while(true) {
                try {
                System.out.println("1. Προσθεση");
                System.out.println("2. Αφεραιση");
                System.out.println("3. Πολλαπλασιαμος");
                System.out.println("4. Διαιρεση");
                System.out.println("5 Υπολοιπο Διαιρεσης");
                System.out.println("6. Εξοδος");

                choice = in.nextInt();
                    System.out.println("Επιλεξτε ενα απο τα παρακατω");
                if (choice <=1 && choice >6){
                    System.out.println("Λαθος Επιλογη");
                }

                if (choice <=0){
                    System.out.println("ο Αριθμος πρεπει να ειναι θετικος");
                    continue;
                }
                if (choice == 6){
                    System.out.println("Ευχαριστουμε ");
                    break;
                }
                    System.out.println("Εισαγετε δυο ακεραιους");
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    switch (choice){
                        case 1:
                            result = num1 + num2;
                            break;
                        case 2:
                            result = num1 - num2;
                            break;
                        case 3:
                            result = num1 * num2;
                            break;
                        case 4:
                            result = num1 / num2;
                            break;
                        case 5:
                            result = num1 % num2;
                            break;
                        default:
                            System.out.println("Error choice");
                            break;
                    }

                }catch (InputMismatchException e){
                    System.out.println("Πρεπει να εισαγετε Αριθμο");
                    in.nextLine();

                }catch (ArithmeticException e){

                }
                System.out.println("Το αποτελεσμα ειναι: "+ result);
       }
    }
}
