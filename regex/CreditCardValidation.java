package com.gla.regex;
import java.util.Scanner;
public class CreditCardValidation {

    public class ValidateCreditCard {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter credit card number: ");
            String card = sc.nextLine();

            String regex = "^4\\d{15}$|^5\\d{15}$";

            if (card.matches(regex)) {
                System.out.println("Valid Card");
            } else {
                System.out.println("Invalid Card");
            }
        }
    }
}
