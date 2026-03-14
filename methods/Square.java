package methods;

public class Square {
    void show (int n){
        System.out.println(n*n);
    }

    static void main(String[] args) {
        Square sc = new Square();
        sc.show(4);
    }
}
