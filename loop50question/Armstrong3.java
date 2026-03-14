package loop50question;

import java.util.Scanner;

public class Armstrong3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
}
