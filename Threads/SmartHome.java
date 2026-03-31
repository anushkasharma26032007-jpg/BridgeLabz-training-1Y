package com.gla.Threads;
import java.time.LocalTime;

class Device extends Thread {
    private String deviceName;
    private int interval;

    public Device(String name, int seconds, int priority) {
        this.deviceName = name;
        this.interval = seconds * 1000;
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(LocalTime.now() + " - " + deviceName + ": Status Active (Cycle " + i + ")");
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(deviceName + " completed its cycles.");
    }
}
public class SmartHome {
    public static void main(String[] args) {
        new Device("Security Camera", 3, 10).start();
        new Device("Temperature Sensor", 5, 7).start();
        new Device("Light Controller", 4, 5).start();
        new Device("Door Lock Monitor", 6, 5).start();
    }
}
