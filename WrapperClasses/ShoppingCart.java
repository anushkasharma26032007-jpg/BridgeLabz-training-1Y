package com.gla.WrapperClasses;

public class ShoppingCart {
    public static void main(String[] args) {
        String[] prices = {"250", "499", "abc", "99"};

        int total = 0;

        for (int i = 0; i < prices.length; i++) {
            try {
                int price = Integer.parseInt(prices[i]); // convert
                total += price;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price: " + prices[i]);
            }
        }

        System.out.println("Total Price = " + total);
    }

}
