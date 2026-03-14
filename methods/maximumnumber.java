package methods;

public class maximumnumber {
    void main(int a,int b){
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println(" b is greater than a");
        }
    }

    static void main(String[] args) {
        maximumnumber m = new maximumnumber();
        m.main(8,9);
    }
}
