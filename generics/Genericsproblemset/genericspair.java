package com.gla.Generics.Genericsproblemset;

public class genericspair {
    class Pair<T, U> {
        private T first;
        private U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() { return first; }
        public U getSecond() { return second; }
    }

    // Test
    Pair<String, Integer> student = new Pair<>("Amol", 20);
}
