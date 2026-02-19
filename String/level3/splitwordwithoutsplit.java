package com.gla.String.level3;
import java.util.Scanner;
public class splitwordwithoutsplit {

        public static String[] splitWords(String text) {
            int spaces = 0;
            for (int i = 0; i < text.length(); i++)
                if (text.charAt(i) == ' ')
                    spaces++;

            String[] words = new String[spaces + 1];
            String word = "";
            int index = 0;

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) != ' ')
                    word += text.charAt(i);
                else {
                    words[index++] = word;
                    word = "";
                }
            }
            words[index] = word;
            return words;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String[] result = splitWords(text);
            for (String w : result)
                System.out.println(w);
        }

}
