package dailypractice;

import java.util.Scanner;

class bachhi{
    String name;
    int marks;

    void display(){
        System.out.println("name is "+name);
        System.out.println("marks is "+marks);
    }
}
public class classesobjectsday2 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        bachhi b=new bachhi();
        b.marks=98;
        b.name="Anushka sharma ji is one the most popular girl in this world";
        b.display();
    }
}
