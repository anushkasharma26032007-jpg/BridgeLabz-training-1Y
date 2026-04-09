package dailypractice;
abstract class shape{
    abstract void area();
}
class  Rectangl extends shape{
int length =10;
int breadth =5;

void area(){
    System.out.println("Area equalt to "+length * breadth);
}
}
public class TestShape {
    public static void main(String[] args) {
        Rectangl r1 =new Rectangl();
        r1.area();
    }
}
