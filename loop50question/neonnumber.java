package loop50question;

import java.util.Scanner;

public class neonnumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int product=1;
        while(n!=0){
            int r=n%10;
            sum=sum+r;
            product=product*r;
            n=n/10;
        }
        if(sum==product){
            System.out.println("neon number");
        }
        else{
            System.out.println("not neon number");
        }
    }
}
