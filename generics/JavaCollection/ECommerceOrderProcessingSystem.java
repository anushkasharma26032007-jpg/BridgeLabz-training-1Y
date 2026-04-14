package com.gla.Generics.JavaCollection;
import java.util.*;

class Order {
    int id;
    String item;

    Order(int id, String item) {
        this.id = id;
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return id == order.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " - " + item;
    }
}

public class ECommerceOrderProcessingSystem {

    public static void main(String[] args) {

        List<Order> allOrders = new ArrayList<>();
        allOrders.add(new Order(1, "Laptop"));
        allOrders.add(new Order(2, "Phone"));
        allOrders.add(new Order(1, "Laptop Duplicate"));
        allOrders.add(new Order(3, "Shoes"));

        Set<Order> uniqueOrders = new LinkedHashSet<>(allOrders);

        Queue<Order> queue = new LinkedList<>(uniqueOrders);

        Stack<Order> failedStack = new Stack<>();

        while (!queue.isEmpty()) {
            Order order = queue.poll();
            System.out.println("Processing: " + order);

            if (order.id == 2) {
                System.out.println("Failed: " + order);
                failedStack.push(order);
            }
        }

        while (!failedStack.isEmpty()) {
            Order order = failedStack.pop();
            System.out.println("Reprocessing: " + order);
        }
    }
}
