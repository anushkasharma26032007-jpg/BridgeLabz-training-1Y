package com.gla.String.level3;
import java.util.Scanner;
public class customtrim {

        public static String customTrim(String text) {
            int start = 0;
            int end = text.length() - 1;

            while (start <= end && text.charAt(start) == ' ')
                start++;

            while (end >= start && text.charAt(end) == ' ')
                end--;

            String result = "";
            for (int i = start; i <= end; i++)
                result += text.charAt(i);

            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String result = customTrim(text);
            System.out.println(result);
        }

}
