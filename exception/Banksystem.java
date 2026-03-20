package com.gla.exception;

public class Banksystem {

    int balance =1000;

    public void withdraw(int amount) {
        try{
            if(amount > balance){
                throw new Insufficient("insufficient balance");
                }
                balance = balance - amount;
                System.out.println("Amount withdraw sccesfully :" + balance);
            } catch(Insufficient e){
                System.out.println("exception handled inside method:" + e.getMessage());
            }
        }
        public static void main(String [] args){
            Banksystem bs = new Banksystem();
            bs.withdraw(20000);
            System.out.println("program continue....");
        }

    }

