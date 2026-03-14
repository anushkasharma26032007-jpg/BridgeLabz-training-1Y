package loop50question;

import java.util.Scanner;

public class strongnumber2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
         int temp=n;
        while(n!=0){
            int r=n%10;
            int fact=1;
        for (int i = 1; i <= r; i++) {
            fact = fact * i;
        }
         sum = sum + fact;
        n = n / 10;
    }
        if(temp==sum){
            System.out.println("strong number");
        }
        else{
            System.out.println("not strong number");
        }
    }
}
