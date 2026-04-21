package com.gla.LamdaExpression;
import java.util.*;
import java.util.function.Predicate;
public class Notification {

    public static void main(String[] args) {

        List<String> alerts = Arrays.asList("Normal", "Emergency", "Low", "Critical");

        Predicate<String> important = a -> a.equals("Emergency") || a.equals("Critical");

        alerts.stream()
                .filter(important)
                .forEach(System.out::println);
    }

}
