package com.gla.Generics.Genericsproblemset;

public class FruitStorage {
    class Fruit {}

    class Apple extends Fruit {}
    class Mango extends Fruit {}

    class FruitBox<T extends Fruit> {
        T fruit;

        public void add(T fruit) {
            this.fruit = fruit;
        }

        public void show() {
            System.out.println(fruit.getClass().getSimpleName());
        }
    }

}
