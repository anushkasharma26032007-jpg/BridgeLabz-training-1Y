package dailypractice;
class Anima{
    void ea(){
        System.out.println("ANimal are eating ");
    }
}
class Do extends Anima{
    void bar(){
        System.out.println("Dog barks");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Do d= new Do();
        d.bar();
        d.ea();
    }
}
