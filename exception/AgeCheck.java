package com.gla.exception;
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
public class AgeCheck {
    static void validAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        else{
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        try{
            validAge(15);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
