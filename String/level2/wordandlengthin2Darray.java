package com.gla.String.level2;
import java.util.Scanner;

public class wordandlengthin2Darray {
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

        public static String[][] wordLength(String[] words) {
            String[][] result = new String[words.length][2];
            for (int i = 0; i < words.length; i++) {
                result[i][0] = words[i];
                result[i][1] = String.valueOf(findLength(words[i]));
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String[] words = splitText(text);
            String[][] data = wordLength(words);

            for (int i = 0; i < data.length; i++)
                System.out.println(data[i][0] + "\t" + Integer.parseInt(data[i][1]));
        }
}
