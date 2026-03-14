package loop50question;
import java.util.Scanner;
public class powerbase {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();
        int result=1;
        for (int i=1;i<=power;i++){
            result=result*base;
        }
        System.out.println(result);
    }
}
