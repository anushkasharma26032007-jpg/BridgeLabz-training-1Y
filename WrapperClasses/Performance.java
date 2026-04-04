package com.gla.WrapperClasses;
import java.util.*;
public class Performance {
    public static void main(String[] args) {
        long start, end;

        // ArrayList
        start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) list.add(i);

        long sum = 0;
        for (int n : list) sum += n;
        end = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (end - start));

        // Array
        start = System.currentTimeMillis();
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) arr[i] = i;

        sum = 0;
        for (int n : arr) sum += n;
        end = System.currentTimeMillis();
        System.out.println("Array time: " + (end - start));
    }
}
