package com.gla.WrapperClasses;
import java.util.*;
public class Employee {
    public static void main(String[] args) {
        int[] ages = {22, 45, 19, 30};

        ArrayList<Integer> list = new ArrayList<>();
        for (int age : ages) {
            list.add(age);
        }

        System.out.println("Min: " + Collections.min(list));
        System.out.println("Max: " + Collections.max(list));
    }
}
