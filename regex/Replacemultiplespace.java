package com.gla.regex;
import java.util.Scanner;

public class Replacemultiplespace {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter text: ");
            String text = sc.nextLine();

            String result = text.replaceAll("\\s+", " ");

            System.out.println("After replacing spaces:");
            System.out.println(result);
        }
    }
