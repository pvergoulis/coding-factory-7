package gr.aueb.cf.ch2;

import java.util.Scanner;

public class PriceWithVat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double VAR_RATE = 0.24;
        double price = 0.0;
        double finalPrice = 0.0;
        double vat = 0.0;

        System.out.println("Please insert the price of the product");
        price = in.nextDouble();
        vat = price * VAR_RATE;
        finalPrice = price + vat;


        System.out.printf("Price: %.2f, vat: %.2f, price with vat: %.2f", price, vat, finalPrice);
    }
}
