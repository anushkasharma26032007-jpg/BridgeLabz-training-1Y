package loop50question;
import java.util.Scanner;
public class evennumbersum {
    static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
     int n=sc.nextInt();
     int sum=0;
      for(int i=1;i<=n;i++) {
          if (n % 2 == 0) {
              System.out.println(+i + "   is even nunmber");
              sum = sum + i;
          }
          System.out.println(+sum + " of even number");
      }
    }
}
