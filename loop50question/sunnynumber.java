package loop50question;

import java.util.Scanner;

public class sunnynumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n+1;
        int root=(int)Math.sqrt(x);
        if(root*root==x){
            System.out.println("sunny number");
        }
        else{
            System.out.println("not sunny number");
        }

    }
}
