package com.gla.String.level1;
import java.util.Scanner;
public class stringindexdemo {
        public static void generateException(String text) {
            System.out.println(text.charAt(text.length())); // Invalid index
        }

        public static void handleException(String text) {
            try {
                System.out.println(text.charAt(text.length()));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutOfBoundsException handled!");
            }
        }

        public static void main(String[] args) {
            String text = "Java";
            handleException(text);
        }

}
