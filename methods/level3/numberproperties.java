package com.gla.methods.level3;
import java.util.Scanner;

public class numberproperties {

        static int sumOfProperDivisors(int n) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0)
                    sum += i;
            }
            return sum;
        }

        static boolean isPerfect(int n) {
            return sumOfProperDivisors(n) == n;
        }

        static boolean isAbundant(int n) {
            return sumOfProperDivisors(n) > n;
        }

        static boolean isDeficient(int n) {
            return sumOfProperDivisors(n) < n;
        }

        static int factorial(int n) {
            int fact = 1;
            for (int i = 1; i <= n; i++)
                fact *= i;
            return fact;
        }

        static boolean isStrong(int n) {
            int temp = n, sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp /= 10;
            }
            return sum == n;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            System.out.println("Perfect: " + isPerfect(num));
            System.out.println("Abundant: " + isAbundant(num));
            System.out.println("Deficient: " + isDeficient(num));
            System.out.println("Strong: " + isStrong(num));
        }

}
