package com.gla.Generics.JavaCollection;
import java.util.*;
public class ReverseaQueue {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        reverseQueue(q);

        System.out.println(q); // [30, 20, 10]
    }

    public static void reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) return;

        int x = q.remove();
        reverseQueue(q);
        q.add(x);
    }

}
