package com.gla.Generics.MapAssingment;
import java.util.*;
public class EmployeeSalaryDirectory {

    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();

        map.put("A", 50000.0);
        map.put("B", 60000.0);
        map.put("C", 70000.0);
        map.put("D", 80000.0);

        String emp = "A";
        if (map.containsKey(emp)) {
            map.put(emp, map.get(emp) * 1.1);
        }

        double sum = 0;
        for (double val : map.values()) {
            sum += val;
        }

        System.out.println("Avg: " + sum / map.size());

        double max = 0;
        for (double val : map.values()) {
            max = Math.max(max, val);
        }

        for (String key : map.keySet()) {
            if (map.get(key) == max) {
                System.out.println("Top: " + key);
            }
        }
    }

}
