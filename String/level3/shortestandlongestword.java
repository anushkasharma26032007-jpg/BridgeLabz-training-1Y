package com.gla.String.level3;
import java.util.Scanner;
public class shortestandlongestword {

        public static String[] findWords(String text) {
            String[] words = text.split(" ");
            String shortest = words[0];
            String longest = words[0];

            for (String w : words) {
                if (w.length() < shortest.length())
                    shortest = w;
                if (w.length() > longest.length())
                    longest = w;
            }
            return new String[]{shortest, longest};
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String[] result = findWords(text);
            System.out.println("Shortest: " + result[0]);
            System.out.println("Longest: " + result[1]);
        }

}
