package com.gla.Generics.MapAssingment;
import java.util.*;
public class LibraryCatalog {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("111", "Java");
        map.put("222", "DSA");
        map.put("333", "OS");

        String isbn = "222";

        if (map.containsKey(isbn)) {
            System.out.println(map.get(isbn));
        } else {
            System.out.println("Book not found");
        }

        map.remove("333");

        TreeMap<String, String> sorted = new TreeMap<>(map);

        for (String key : sorted.keySet()) {
            System.out.println(key + " " + sorted.get(key));
        }

        String title = "Java";
        for (String key : map.keySet()) {
            if (map.get(key).equals(title)) {
                System.out.println("Found ISBN: " + key);
            }
        }
    }
}
