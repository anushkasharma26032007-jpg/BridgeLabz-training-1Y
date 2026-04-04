package com.gla.WrapperClasses;
import java.util.*;
public class EmployeeData {
    public static void main(String[] args) {

        int[] ages = {22, 45, 19, 30, 27};

        // Step 1: Convert array → ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages) {
            list.add(age); // auto-boxing
        }

        // Step 2: Find min & max
        int minAge = Collections.min(list);
        int maxAge = Collections.max(list);

        System.out.println("Youngest Age = " + minAge);
        System.out.println("Oldest Age = " + maxAge);
    }

}
