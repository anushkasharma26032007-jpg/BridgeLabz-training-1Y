package loop50question;

import java.util.Scanner;

public class sumofdigit {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int  n= sc.nextInt();
        int sum =0;
        for(int i=1;i<n;i++){
             int r=n% 10;
            sum =sum +r;
            n=n/10;
        }
        System.out.println(+sum);

    }
}
