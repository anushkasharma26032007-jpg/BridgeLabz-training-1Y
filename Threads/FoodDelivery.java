package com.gla.Threads;
class Order implements Runnable {
    private String id, restaurant, type;
    private int deliveryTime;

    public Order(String id, String restaurant, int time, String type) {
        this.id = id;
        this.restaurant = restaurant;
        this.deliveryTime = time;
        this.type = type;
    }

    @Override
    public void run() {
        String agent = Thread.currentThread().getName();
        long startTime = System.currentTimeMillis();

        System.out.println(agent + " Picked up Order " + id + " from " + restaurant + " (" + type + ")");
        try {
            Thread.sleep(1000); // Brief transit prep
            System.out.println("Order " + id + " is In Transit...");
            Thread.sleep(deliveryTime * 1000);
        } catch (InterruptedException e) { e.printStackTrace(); }

        long totalTime = (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("Order " + id + " Delivered by " + agent + ". Total time: " + totalTime + "s");
    }
}
public class FoodDelivery {
    public static void main(String[] args) {
        Thread o1 = new Thread(new Order("101", "Pizza Hut", 2, "Express"), "Agent-A");
        o1.setPriority(10);
        Thread o2 = new Thread(new Order("102", "Burger King", 4, "Standard"), "Agent-B");
        o2.setPriority(5);
        o1.start(); o2.start();
    }
}
