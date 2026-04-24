package com.gla.regex;
import java.util.Scanner;

public class IPaddress{
    public class ValidateIP {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter IP address: ");
            String ip = sc.nextLine();

            String regex = "^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}$";

            if (ip.matches(regex)) {
                System.out.println("Valid IP Address");
            } else {
                System.out.println("Invalid IP Address");
            }
        }
    }
}
