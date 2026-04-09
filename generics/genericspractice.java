package com.gla.generics;
//class Number<T>{
//
//    T num; //(T type perimeter) it is used in method ,class and interface
//    void setNumber(T num){
//        this.num=num;
//    }
//    T getNumber(){
//        return num;
//    }
//}


class username<T>{
    T name;
    void setName(T name){
        this.name=name;
    }
    T getName(){
       return name;
    }

}
  public class genericspractice{
  public static void main(String[] args) {
//    Number<Integer> n1 = new Number<>();
//    n1.setNumber(23);
//       System.out.println(n1.getNumber());
//    Number<Double> n2=new Number<>();
//    n2.setNumber(68.000000000);
//       System.out.println(n2.getNumber());

      username<String> n1 =new username<>();
      n1.setName("Anushka Sharma");
      System.out.println(n1.getName());
      username<String> n2 =new username<>();
      n2.setName("mi is my favourite ipl team");
      System.out.println(n2.getName());

    }
}
