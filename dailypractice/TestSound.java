package dailypractice;
abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
  void sound(){
      System.out.println("Bark.........");
  }
}
class Cat extends Animal{
    void sound(){
        System.out.println("meow,,,,,,,,,,,,,,,,,,,,");
    }
}
public class TestSound {
    public static void main(String[] args) {
      Dog d =new Dog();
        Cat c =new Cat();
        d.sound();
        c.sound();

        }
    }

