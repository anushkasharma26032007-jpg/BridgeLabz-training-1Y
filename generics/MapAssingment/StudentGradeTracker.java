package com.gla.Generics.MapAssingment;
import java.util.*;
public class StudentGradeTracker {

    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();

        map.put("Aman", 80.0);
        map.put("Riya", 90.0);
        map.put("Raj", 70.0);

        map.put("Aman", 85.0);

        map.remove("Raj");

        TreeMap<String, Double> sorted = new TreeMap<>(map);

        for (String key : sorted.keySet()) {
            System.out.println(key + " " + sorted.get(key));
        }
    }
}
