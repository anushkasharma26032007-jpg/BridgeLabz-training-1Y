package methods;

public class Demo {
        void hello() {             // method
            System.out.println("Hello Java");
        }

        public static void main(String[] args) {

            Demo d = new Demo();   // object create
            d.hello();             // method call
        }
    }
