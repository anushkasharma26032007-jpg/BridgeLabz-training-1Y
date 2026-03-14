package loop50question;

import java.sql.SQLOutput;
import java.util.Scanner;

public class palidromenum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int r=0;
        while (n!=0){
            r =r*10+n%10;
            n=n/10;
        }
        if(n==r)
        {
            System.out.println(r);
        }
    }
}
