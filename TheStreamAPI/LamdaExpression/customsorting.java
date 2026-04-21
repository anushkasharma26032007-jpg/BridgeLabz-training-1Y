package com.gla.LamdaExpression;
import java.util.*;

class Product {
    String name;
    int price;
    int rating;

    Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}
public class customsorting {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Laptop", 50000, 4));
        list.add(new Product("Phone", 20000, 5));
        list.add(new Product("Tablet", 30000, 3));

        list.sort((a, b) -> a.price - b.price);

        for (Product p : list) {
            System.out.println(p.name + " " + p.price);
        }
    }
}
