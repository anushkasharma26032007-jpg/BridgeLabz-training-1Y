package com.gla.Generics.MapAssingment;
import java.util.*;
public class InventoryManagement {

    public static void main(String[] args) {

        Map<String, Integer> stock = new HashMap<>();

        stock.put("Milk", 10);
        stock.put("Bread", 5);

        stock.put("Milk", stock.get("Milk") - 10);

        if (stock.get("Milk") <= 0) {
            stock.remove("Milk");
        }

        stock.put("Bread", stock.getOrDefault("Bread", 0) + 5);

        String item = "Bread";
        System.out.println(stock.getOrDefault(item, 0));

        for (String key : stock.keySet()) {
            if (stock.get(key) == 0) {
                System.out.println("Out of stock: " + key);
            }
        }
    }
}
