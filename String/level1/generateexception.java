package com.gla.String.level1;
import java.util.Scanner;
public class generateexception {

        public static void generateException() {
            String[] names = {"A", "B", "C"};
            System.out.println(names[5]);
        }

        public static void handleException() {
            try {
                String[] names = {"A", "B", "C"};
                System.out.println(names[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException handled!");
            }
        }

        public static void main(String[] args) {
            // generateException();
            handleException();
        }

}
