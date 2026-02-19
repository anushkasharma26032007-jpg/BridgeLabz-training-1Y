package com.gla.String.level3;
import java.util.Scanner;
public class vowelandconsonantcount {

        public static int[] countVC(String text) {
            int vowels = 0, consonants = 0;
            text = text.toLowerCase();

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                        vowels++;
                    else
                        consonants++;
                }
            }
            return new int[]{vowels, consonants};
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            int[] result = countVC(text);
            System.out.println("Vowels: " + result[0]);
            System.out.println("Consonants: " + result[1]);
        }

}
