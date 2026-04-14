package com.gla.Generics.Genericsproblemset;
import java.util.*;
public class AnimalHierarchy {
    class Animal {}
    class Dog extends Animal {}
    class Cat extends Animal {}

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a.getClass().getSimpleName());
        }
    }
}
