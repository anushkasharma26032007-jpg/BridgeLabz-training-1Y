package Arrays;
import java.util.Scanner;
public class Armstrongnumber {
    static void main(String[] args ) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int am=n;
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==am){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("not armstrong");
        }
    }
}
