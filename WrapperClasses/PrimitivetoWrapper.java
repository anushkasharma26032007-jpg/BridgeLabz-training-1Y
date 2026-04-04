package com.gla.WrapperClasses;

import java.util.Scanner;
import java.util.stream.Gatherer;

public class PrimitivetoWrapper {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        Integer obj=Integer.valueOf(n);
        System.out.println("Primitive is  - "+n);
        System.out.println("Wrapper is - "+obj);
    }
}
