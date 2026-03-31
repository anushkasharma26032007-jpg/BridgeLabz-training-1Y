package com.gla.Threads;
import java.util.*;

class SupportTicket extends Thread {
    private int ticketId;
    private String type;
    private static long startTime;
    private static List<Long> waitTimes = new ArrayList<>();

    public SupportTicket(int id, String type, int priority) {
        this.ticketId = id;
        this.type = type;
        setPriority(priority);
    }

    @Override
    public void run() {
        long startProcessing = System.currentTimeMillis();
        int processTime = (int) (Math.random() * 4000) + 1000;

        System.out.println("Agent " + getName() + " STARTING Ticket #" + ticketId + " (" + type + ") Priority: " + getPriority());

        try {
            Thread.sleep(processTime);
        } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("Agent " + getName() + " FINISHED Ticket #" + ticketId);
    }
}
public class SupportSystem {
    public static void main(String[] args) {

        SupportTicket t1 = new SupportTicket(1, "Critical Bug", 10);
        SupportTicket t2 = new SupportTicket(2, "General Query", 2);

        t1.start();
        t2.start();
    }
}
