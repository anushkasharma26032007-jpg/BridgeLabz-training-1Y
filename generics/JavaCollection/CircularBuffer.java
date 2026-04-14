package com.gla.Generics.JavaCollection;

class CircularBuffer1{
    int[] arr;
    int size, front = 0, count = 0;

    CircularBuffer1(int size) {
        this.size = size;
        arr = new int[size];
    }

    void add(int x) {
        arr[(front + count) % size] = x;

        if (count == size) {
            front = (front + 1) % size; // overwrite
        } else {
            count++;
        }
    }

    void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[(front + i) % size] + " ");
        }
    }
}

public class CircularBuffer {

    public static void main(String[] args) {

        CircularBuffer1 cb = new CircularBuffer1(3);

        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.add(4);

        cb.display();
    }
}
