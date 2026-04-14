package com.gla.Generics.Genericsproblemset;
import java.util.*;
public class GenericCart {


    class Cart<T> {
        List<T> items = new ArrayList<>();

        void addItem(T item) { items.add(item); }
        void removeItem(T item) { items.remove(item); }

        void displayItems() {
            for (T item : items) {
                System.out.println(item);
            }
        }
    }
}
