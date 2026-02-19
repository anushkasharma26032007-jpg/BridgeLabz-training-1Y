package com.gla.String.level3;
import java.util.Scanner;
public class converttolowercaseuppercase {

        public static String toLowerManual(String text) {
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c >= 'A' && c <= 'Z')
                    c = (char)(c + 32);
                result += c;
            }
            return result;
        }

        public static boolean compare(String a, String b) {
            if (a.length() != b.length())
                return false;

            for (int i = 0; i < a.length(); i++)
                if (a.charAt(i) != b.charAt(i))
                    return false;

            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();

            String manual = toLowerManual(text);
            String builtIn = text.toLowerCase();

            boolean result = compare(manual, builtIn);
            System.out.println(result);
        }

}
