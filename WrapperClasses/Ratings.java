package com.gla.WrapperClasses;
import java.util.*;
public class Ratings {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(null);
        list.add(4);

        ArrayList<Integer> combined = new ArrayList<>();

        for (int n : arr) combined.add(n);
        for (Integer n : list)
            if (n != null) combined.add(n);

        int sum = 0;
        for (int n : combined) sum += n;

        System.out.println("Average: " + (sum / combined.size()));
    }

}
