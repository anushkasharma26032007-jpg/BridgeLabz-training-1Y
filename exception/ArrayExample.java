package com.gla.exception;

public class ArrayExample {
    public static void main(String [] args){
        int []arr = {10,20,30};
        try{
            int index =5;
            System.out.println("value:" +arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invallid index");
        }
        catch(NullPointerException e){
            System.out.println("Array is not intialized");
        }

    }
}
