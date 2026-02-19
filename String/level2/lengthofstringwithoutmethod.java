package com.gla.String.level2;
import java.util.Scanner;

public class lengthofstringwithoutmethod {

        public static int findLength(String text) {
            int count = 0;
            try {
                while (true) {
                    text.charAt(count);
                    count++;
                }
            } catch (Exception e) {
                return count;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.next();

            int length1 = findLength(text);
            int length2 = text.length();

            System.out.println("Length using charAt(): " + length1);
            System.out.println("Length using length(): " + length2);
        }

}
