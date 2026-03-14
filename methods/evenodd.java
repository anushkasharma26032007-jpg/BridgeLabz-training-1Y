package methods;

public class evenodd {
    void main(int n){
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    static void main(String[] args) {
        evenodd eo = new evenodd();
        eo.main(7);
    }
}
