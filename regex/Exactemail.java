package com.gla.regex;
import java.util.Scanner;
import java.util.regex.*;
public class Exactemail {
        public static void main(String[] args) {

            String text = "Contact us at support@example.com and info@company.org";

            String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(text);

            while (m.find()) {
                System.out.println(m.group());
            }
    }
}
