package com.gla.Generics.MapAssingment;
import java.util.*;
public class WordFrequency {

    public static void main(String[] args) {

        String s = "Java is fun and Java is powerful";
        s = s.toLowerCase();

        String[] arr = s.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String w : arr) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

}
