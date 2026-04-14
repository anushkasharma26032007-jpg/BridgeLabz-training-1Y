package com.gla.Generics.MapAssingment;
import java.util.*;
public class CourseRegistrationSystem {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("CS101", 45);
        map.put("CS102", 55);
        map.put("CS103", 3);

        map.put("CS101", map.get("CS101") + 10);
        map.put("CS103", Math.max(0, map.get("CS103") - 2));

        for (String key : map.keySet()) {
            if (map.get(key) >= 50) {
                System.out.println("Near full: " + key);
            }
            if (map.get(key) < 5) {
                System.out.println("Under-subscribed: " + key);
            }
        }
    }
}
