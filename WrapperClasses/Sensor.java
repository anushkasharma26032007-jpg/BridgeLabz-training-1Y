package com.gla.WrapperClasses;

public class Sensor {
    public static void logData(Double value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        double temp = 25.5;
        logData(temp); // auto-boxing
    }
}
