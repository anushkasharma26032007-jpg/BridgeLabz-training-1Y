package com.gla.Generics.Genericsproblemset;
import java.util.*;
public class PriceCalculator {

    class Product {
        double price;

        public double getPrice() {
            return price;
        }
    }

    class Mobile extends Product {}
    class Laptop extends Product {}

    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }
}
