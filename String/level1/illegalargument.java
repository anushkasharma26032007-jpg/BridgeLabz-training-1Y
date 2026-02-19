package com.gla.String.level1;
import java.util.Scanner;
public class illegalargument {
        public static void generateException(String text) {
            System.out.println(text.substring(5, 2));
        }

        public static void handleException(String text) {
            try {
                System.out.println(text.substring(5, 2));
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException handled!");
            }
        }

        public static void main(String[] args) {
            String text = "JavaProgramming";
            handleException(text);
        }

}
