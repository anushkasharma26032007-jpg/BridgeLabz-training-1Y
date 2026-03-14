package loop50question;

import java.util.Scanner;

public class Armstrongnumberupton {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<n;i++){
            int temp=i;
            int sum=0;
            while(temp!=0){
                int r=temp%10;
                sum=sum+(r*r*r);
                temp=temp/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
