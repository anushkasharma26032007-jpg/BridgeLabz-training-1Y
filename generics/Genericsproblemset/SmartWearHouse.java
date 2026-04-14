package com.gla.Generics.Genericsproblemset;
import java.util.*;
public class SmartWearHouse {
    abstract class WarehouseItem {}

    class Electronics extends WarehouseItem {}
    class Groceries extends WarehouseItem {}
    class Furniture extends WarehouseItem {}

    class Storage<T extends WarehouseItem> {
        List<T> items = new ArrayList<>();

        void add(T item) { items.add(item); }

        void show() {
            for (T i : items) {
                System.out.println(i.getClass().getSimpleName());
            }
        }
    }

    public static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem w : list) {
            System.out.println(w.getClass().getSimpleName());
        }
    }
}
