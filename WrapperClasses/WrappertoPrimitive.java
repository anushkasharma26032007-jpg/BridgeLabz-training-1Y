package com.gla.WrapperClasses;

public class WrappertoPrimitive {
    public static void main(String[] args) {
        Double obj=45.0;
        double d=obj;//ye autoboxing hai
        int i=(int )obj.doubleValue();//ise bolte hai casting (decimal hata ke integer banana)
        System.out.println("Double "+d);
        System.out.println("int "+i);
    }
}
