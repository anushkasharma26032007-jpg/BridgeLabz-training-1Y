package com.gla.String.level3;
import java.util.Scanner;
public class frequencyusinguniquecharacter {

        public static char[] unique(String text) {
            char[] temp = new char[text.length()];
            int index = 0;

            for (int i = 0; i < text.length(); i++) {
                boolean found = false;
                for (int j = 0; j < i; j++)
                    if (text.charAt(i) == text.charAt(j))
                        found = true;
                if (!found)
                    temp[index++] = text.charAt(i);
            }

            char[] result = new char[index];
            for (int i = 0; i < index; i++)
                result[i] = temp[i];
            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            char[] unique = unique(text);

            for (char c : unique) {
                int count = 0;
                for (int i = 0; i < text.length(); i++)
                    if (text.charAt(i) == c)
                        count++;
                System.out.println(c + " " + count);
            }
        }

}
