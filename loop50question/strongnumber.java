package loop50question;
import java.util.Scanner;
public class strongnumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int number=n;
        int st=0;
        while(n!=0) {
            int r = n % 10;
            int fact = 1;
            for (int i = 1; i <= r; i++) {
                fact = fact * i;
            }
            st = st + fact;
            n = n / 10;
        }
        if(st ==number){
            System.out.println("strong number");
        }
        else {
            System.out.println("not strong number");
        }
    }
}
