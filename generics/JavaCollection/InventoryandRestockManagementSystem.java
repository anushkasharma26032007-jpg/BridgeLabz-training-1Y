package com.gla.Generics.JavaCollection;
import java.util.*;

class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return name + " (" + stock + ")";
    }
}


public class InventoryandRestockManagementSystem {

    public static void main(String[] args) {

        Set<String> productNames = new HashSet<>();

        List<Product> products = new ArrayList<>();

        Queue<Product> restockQueue = new LinkedList<>();

        Stack<Product> restockedStack = new Stack<>();

        addProduct(productNames, products, new Product("Milk", 50, 5));
        addProduct(productNames, products, new Product("Bread", 30, 2));
        addProduct(productNames, products, new Product("Milk", 50, 5));

        for (Product p : products) {
            if (p.stock < 3) {
                restockQueue.add(p);
            }
        }

        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 10;
            restockedStack.push(p);
            System.out.println("Restocked: " + p);
        }

        if (!restockedStack.isEmpty()) {
            Product last = restockedStack.pop();
            last.stock -= 10;
            System.out.println("Undo Restock: " + last);
        }
    }

    static void addProduct(Set<String> names, List<Product> list, Product p) {
        if (names.add(p.name)) {
            list.add(p);
        }
    }
}
