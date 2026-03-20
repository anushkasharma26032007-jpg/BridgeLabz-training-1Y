package Inheritance;
class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("Dog barks");
    }
}
class puppy extends Dog {
    void weeps(){
        System.out.println("Dog weep");
    }
}
public class MultipleInheritance {
    static void main() {
        puppy d = new puppy();
        d.Bark();
        d.eat();
        d.weeps();
    }

}
