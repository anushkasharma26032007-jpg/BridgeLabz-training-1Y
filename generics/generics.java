package com.gla.generics;

public class generics {
    public static <T>void swap(T a,T b){
        System.out.println("Before Swapping:  "+a+"  "+b);

        T temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: "+a+" "+b );
    }
    public static void main(String[] args){
        swap(5, 10);
        swap("jay", "veeru");
    }
}
