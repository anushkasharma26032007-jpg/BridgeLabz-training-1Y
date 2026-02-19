package com.gla.String.level2;
import java.util.Scanner;
public class shortestandlongestword {

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

        public static String[] splitText(String text) {
            int len = findLength(text);
            int words = 1;
            for (int i = 0; i < len; i++)
                if (text.charAt(i) == ' ')
                    words++;

            String[] result = new String[words];
            int index = 0;
            String temp = "";

            for (int i = 0; i < len; i++) {
                if (text.charAt(i) != ' ')
                    temp += text.charAt(i);
                else {
                    result[index++] = temp;
                    temp = "";
                }
            }
            result[index] = temp;
            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String[] words = splitText(text);

            String shortest = words[0];
            String longest = words[0];

            for (int i = 1; i < words.length; i++) {
                if (findLength(words[i]) < findLength(shortest))
                    shortest = words[i];
                if (findLength(words[i]) > findLength(longest))
                    longest = words[i];
            }

            System.out.println("Shortest: " + shortest);
            System.out.println("Longest: " + longest);
        }

}
