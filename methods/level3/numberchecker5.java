package com.gla.methods.level3;
import java.util.Scanner;

public class numberchecker5 {

        static boolean isPrime(int n) {
            if (n <= 1)
                return false;

            for (int i = 2; i <= n / 2; i++)
                if (n % i == 0)
                    return false;

            return true;
        }

        static boolean isNeon(int n) {
            int square = n * n;
            int sum = 0;

            while (square > 0) {
                sum += square % 10;
                square /= 10;
            }

            return sum == n;
        }

        static boolean isSpy(int n) {
            int sum = 0, product = 1;

            while (n > 0) {
                int d = n % 10;
                sum += d;
                product *= d;
                n /= 10;
            }

            return sum == product;
        }

        static boolean isAutomorphic(int n) {
            int square = n * n;
            return square % (int)Math.pow(10, String.valueOf(n).length()) == n;
        }

        static boolean isBuzz(int n) {
            return n % 7 == 0 || n % 10 == 7;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            System.out.println("Prime: " + isPrime(num));
            System.out.println("Neon: " + isNeon(num));
            System.out.println("Spy: " + isSpy(num));
            System.out.println("Automorphic: " + isAutomorphic(num));
            System.out.println("Buzz: " + isBuzz(num));
        }

}
