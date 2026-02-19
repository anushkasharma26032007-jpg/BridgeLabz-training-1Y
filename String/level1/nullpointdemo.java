package com.gla.String.level1;
import java.util.Scanner;
public class nullpointdemo {
        public static void generateException() {
            String text = null;
            System.out.println(text.length()); // Exception
        }

        public static void handleException() {
            try {
                String text = null;
                System.out.println(text.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException handled!");
            }
        }

        public static void main(String[] args) {
            handleException();
        }
}
