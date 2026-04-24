package com.gla.regex;
import java.util.Scanner;
public class hexcolor {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hex color: ");
        String color = sc.nextLine();

        String regex = "^#[0-9A-Fa-f]{6}$";

        if (color.matches(regex)) {
            System.out.println("Valid Hex Color");
        } else {
            System.out.println("Invalid Hex Color");
        }
    }
}