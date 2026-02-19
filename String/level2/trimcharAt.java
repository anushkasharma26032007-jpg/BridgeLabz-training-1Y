package com.gla.String.level2;
import java.util.Scanner;

public class trimcharAt {

        public static int[] trimIndexes(String text) {
            int start = 0, end = text.length() - 1;

            while (start <= end && text.charAt(start) == ' ')
                start++;
            while (end >= start && text.charAt(end) == ' ')
                end--;

            return new int[]{start, end};
        }

        public static String createSubstring(String text, int start, int end) {
            String result = "";
            for (int i = start; i <= end; i++)
                result += text.charAt(i);
            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();

            int[] index = trimIndexes(text);
            String s1 = createSubstring(text, index[0], index[1]);
            String s2 = text.trim();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1.equals(s2));
        }

}
