package loop50question;

import java.util.Scanner;

public class perfectnumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int perfect = n;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                int r = n % 10;
                sum = sum + r;
                n = n / 10;
            }
        }
        if (perfect == sum) {
            System.out.println("perfect number");
        } else {
            System.out.println("not perfect number");
        }
    }
}
