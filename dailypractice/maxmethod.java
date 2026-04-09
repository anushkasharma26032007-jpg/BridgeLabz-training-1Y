package dailypractice;

import java.util.Scanner;



public class maxmethod {
    static int findmax(int a,int b){
         if(a>b){
             return a;
         }
         else{
             return b;
         }
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max = findmax(a, b);
        System.out.println(max);
    }
}
