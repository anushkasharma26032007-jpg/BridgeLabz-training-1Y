package Inheritance;
class Bird{
    void eat() {
        System.out.println("Bird eat");
    }
}
class peacock extends Bird{
    void fly() {
        System.out.println(" peacock fly");
    }
}
public class SingleInheritance {
      public  static void main(String[] args) {
            peacock s1 = new peacock();
            s1.eat();
            s1.fly();
        }
    }

