package com.gla.Generics.MapAssingment;
import java.util.*;
public class InvertaMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, List<String>> result = new HashMap<>();

        for (String key : map.keySet()) {
            int val = map.get(key);

            result.putIfAbsent(val, new ArrayList<>());
            result.get(val).add(key);
        }

        System.out.println(result);
    }
}
