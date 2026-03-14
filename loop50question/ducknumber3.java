package loop50question;

import java.util.Scanner;

public class ducknumber3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        boolean isduck=false;

        while(temp!=0){
            int r=temp%10;
            if(r==0){
                isduck=true;
                break;
            }
            temp=temp/10;
        }

        if(isduck){
            System.out.println("duck number");
        }
        else{
            System.out.println("not duck number");
        }
    }
}
