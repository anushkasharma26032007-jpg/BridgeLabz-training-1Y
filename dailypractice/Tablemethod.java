package dailypractice;

import java.util.Scanner;

public class Tablemethod {
    static void printtable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i + " ");
        }

    }

   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int num =sc.nextInt();
       printtable(num);
    }
}
