package com.gla.LamdaExpression;
import java.util.*;
import java.util.stream.*;
public class uppercasing {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("anushka", "jyoti", "bhumika");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
