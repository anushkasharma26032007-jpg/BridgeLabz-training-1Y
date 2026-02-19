package com.gla.String.level1;
import java.util.Scanner;
public class numberformat {
        public static void generateException(String text) {
            int num = Integer.parseInt(text);
            System.out.println(num);
        }

        public static void handleException(String text) {
            try {
                int num = Integer.parseInt(text);
                System.out.println(num);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException handled!");
            }
        }

        public static void main(String[] args) {
            String text = "abc123";
            // generateException(text);
            handleException(text);
        }

}
