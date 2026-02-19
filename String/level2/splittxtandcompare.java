package com.gla.String.level2;
import java.util.Scanner;

public class splittxtandcompare {

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

        public static boolean compare(String[] a, String[] b) {
            if (a.length != b.length)
                return false;
            for (int i = 0; i < a.length; i++)
                if (!a[i].equals(b[i]))
                    return false;
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String[] arr1 = splitText(text);
            String[] arr2 = text.split(" ");
            System.out.println(compare(arr1, arr2));
        }

}
