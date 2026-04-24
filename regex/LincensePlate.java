package com.gla.regex;
import java.util.Scanner;
public class LincensePlate {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter license plate: ");
        String plate = sc.nextLine();

        String regex = "^[A-Z]{2}[0-9]{4}$";

        if (plate.matches(regex)) {
            System.out.println("Valid License Plate");
        } else {
            System.out.println("Invalid License Plate");
        }
    }


}
