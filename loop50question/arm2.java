package loop50question;

import java.util.Scanner;

public class arm2 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arm=0;
        int or=n;
        while(n!=0) {
            int r = n % 10;
            arm = arm + (r * r * r);
            n = n / 10;
        }
            if(or==arm){
                System.out.println("armstrong number");
            }
            else{
                System.out.println("not armstrong number");
            }
        }
    }

