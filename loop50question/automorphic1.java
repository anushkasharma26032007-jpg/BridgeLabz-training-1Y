package loop50question;
import java.util.Scanner;

public class automorphic1 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int square=n*n;
        int temp=n;
        boolean isautomophic=true;
        while(temp!=0){
           if(temp%10 != square%10) {
               isautomophic = false;
               break;
           }
               temp = temp / 10;
               square = square / 10;
           }

        if(isautomophic){
            System.out.println("automorphic hai");
        }
        else{
            System.out.println("not hai");
        }
    }
}
