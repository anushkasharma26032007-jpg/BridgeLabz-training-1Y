package classroomcode;
interface MyInterface {
    void sayHello();
}
public class LamdaExpression {

        public static void main(String[] args) {

            MyInterface obj = () -> System.out.println("Hello");

            obj.sayHello();
        }
    }

