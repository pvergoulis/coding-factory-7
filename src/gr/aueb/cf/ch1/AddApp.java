package gr.aueb.cf.ch1;

/**
 *  Calculates the sum of two integers
 *  and the result is printed at console
 *  (standard output)
 */
public class AddApp {

    public static void main(String[] args) {
        //Δήλωση και Αρχικοποίση Μεταβλητών
        int num1 = 5;
        int num2 =12;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση του αποτελέσματος
        System.out.println("Το αποτέλεσμα ειναι: " + result);
        System.out.println("Το άθροιμα των " + num1 + "," + num2+ " είναι ίσο με :" +result);
        System.out.printf("Το άθροιμα των %d, %d είναι ισο με : %d/n", num1, num2, result);
    }
}
