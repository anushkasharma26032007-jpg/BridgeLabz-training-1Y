package com.gla.Generics.JavaCollection;
import java.util.*;
public class GenerateBinaryNumbers {
    public static void main(String[] args) {

        int n = 5;
        generateBinary(n);
    }

    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String s = q.remove();
            System.out.print(s + " ");

            q.add(s + "0");
            q.add(s + "1");
        }
    }

}
