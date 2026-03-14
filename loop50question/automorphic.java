package loop50question;

import java.util.Scanner;

public class automorphic {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int square= n*n;
        int temp =n;
        boolean isautomorphic =true;
        while(temp!=0){
            if(temp%10 != square %10){
                isautomorphic = false;
                break;
            }
            temp=temp/10;
            square=square/10;
        }
        if(isautomorphic){
            System.out.println("automorphic");
        }
        else{
            System.out.println("not automorphic");
        }

    }
}
