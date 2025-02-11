package gr.aueb.cf.ch20.enums;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AccountMain {

    public static void main(String[] args) {
        AccountType accountType = AccountType.CURRENT;


        String strAccountType = accountType.name(); // H name επιστρεφη ενα String
        System.out.println(strAccountType);

        AccountType accountType1 = AccountType.valueOf(strAccountType); // Μετραπουμε ενα String σε enum

        for (AccountType value : AccountType.values()) {
            System.out.print(value.name() + " ");  // String
            System.out.println(value.ordinal());// Ordinal
        }

    }
}
