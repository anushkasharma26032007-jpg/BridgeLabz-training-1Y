package com.gla.String.level3;
import java.util.Scanner;

public class firstnonrepeatingcharacter {

        public static char firstNonRepeat(String text) {
            int[] freq = new int[256];

            for (int i = 0; i < text.length(); i++)
                freq[text.charAt(i)]++;

            for (int i = 0; i < text.length(); i++)
                if (freq[text.charAt(i)] == 1)
                    return text.charAt(i);

            return '\0';
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            System.out.println(firstNonRepeat(text));
        }

}
