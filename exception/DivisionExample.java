package com.gla.exception;
import java.util.*;
public class DivisionExample {
  public  static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter first number");
            int a= sc.nextInt();

            System.out.println("Enter Second number");
            int b = sc.nextInt();

            int result =a/b;
            System.out.println("Result" +result);
        }
        catch (ArithmeticException e){
            System.out.println("cannot by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Enter valid number");
        }
    }
}
