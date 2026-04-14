package com.gla.Generics.JavaCollection;
import java.util.*;
public class NthElemnentFromEnd {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n = 2;

        System.out.println(findNthFromEnd(list, n)); // D
    }

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {

        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();


        for (int i = 0; i < n; i++) {
            fast.next();
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }
}
