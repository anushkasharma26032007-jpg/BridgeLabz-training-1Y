package com.gla.String.level1;
import java.util.Scanner;

public class uppercaseprogram {

        public static String convertToUpper(String text) {
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch >= 'a' && ch <= 'z')
                    ch = (char)(ch - 32);
                result += ch;
            }
            return result;
        }

        public static boolean compare(String s1, String s2) {
            return s1.equals(s2);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();

            String upper1 = convertToUpper(text);
            String upper2 = text.toUpperCase();

            System.out.println("Using charAt(): " + upper1);
            System.out.println("Using toUpperCase(): " + upper2);
            System.out.println("Equal? " + compare(upper1, upper2));
        }

}
