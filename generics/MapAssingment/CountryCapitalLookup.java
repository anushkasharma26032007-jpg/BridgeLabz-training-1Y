package com.gla.Generics.MapAssingment;
import java.util.*;
public class CountryCapitalLookup {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("USA", "Washington");
        map.put("UK", "London");
        map.put("France", "Paris");

        String country = "India";

        if (map.containsKey(country)) {
            System.out.println(map.get(country));
        } else {
            System.out.println("Unknown country");
        }

        TreeMap<String, String> sorted = new TreeMap<>(map);

        for (String key : sorted.keySet()) {
            System.out.println(key + " " + sorted.get(key));
        }
    }

}
