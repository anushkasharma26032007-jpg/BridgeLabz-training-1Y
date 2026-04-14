package com.gla.Generics.Genericsproblemset;

public class DynamicMarketPlace {
    class Product<T> {
        T category;
        double price;

        Product(T category, double price) {
            this.category = category;
            this.price = price;
        }
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.price -= product.price * percent / 100;
    }
}
