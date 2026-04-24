package com.gla.regex;

public class ValidateUsername {
    static void main() {


        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        System.out.println("user_123".matches(regex));  // true
        System.out.println("123user".matches(regex));    // false
        System.out.println("us".matches(regex));
    }
}