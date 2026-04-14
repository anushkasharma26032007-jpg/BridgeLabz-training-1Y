package com.gla.Generics.MapAssingment;
import java.util.*;
public class VotingCount {

    public static void main(String[] args) {

        String[] votes = {"A", "B", "A", "C", "B", "A", "C", "A", "B", "A"};

        Map<String, Integer> map = new HashMap<>();

        for (String v : votes) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }

        String winner = null;
        int max = 0;

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                winner = key;
            }
        }

        System.out.println("Winner: " + winner);
        System.out.println(map);
    }
}
