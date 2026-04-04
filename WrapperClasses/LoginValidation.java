package com.gla.WrapperClasses;

public class LoginValidation {
    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input); // convert string → int

            if (age >= 18)
                return true;
            else
                return false;

        } catch (NumberFormatException e) {
            return false; // invalid number
        }
    }

    public static void main(String[] args) {
        System.out.println(isValidAge("20"));  // true
        System.out.println(isValidAge("15"));  // false
        System.out.println(isValidAge("abc")); // false
    }
}
