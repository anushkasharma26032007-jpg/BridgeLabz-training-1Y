package dailypractice;

import java.util.Scanner;

class Rectangle{
    int length;
    int breadth;
    void display(){
        System.out.println("Area = " +length*breadth);
    }
}
public class Area {
    public static void main(String[] args) {
        Rectangle sc = new Rectangle();
        sc.breadth=7;
        sc.length=6;
        sc.display();
    }
}
