package Arrays;

import java.util.Scanner;

public class palidrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        int palidrome =n;
        while (n != 0) {
            r = r * 10+n % 10;
            n = n / 10;
        }

        if(palidrome==r) {
            System.out.println("palidrome");
        }
            else {
                System.out.println("not palidrome");
        }
    }
}
