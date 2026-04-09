package dailypractice;

import java.util.Scanner;

public class largestofthreenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is larger than b and c");
        } else if (b>a && b>c) {
            System.out.println("b is larger than a and c");

        }
        else {
            System.out.println(" c is greater than a and c");
        }
    }
}
