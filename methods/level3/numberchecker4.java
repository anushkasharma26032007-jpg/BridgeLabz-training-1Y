package com.gla.methods.level3;
import java.util.Scanner;

public class numberchecker4 {

        static int countDigits(int n) {
            int count = 0;
            while (n > 0) {
                count++;
                n /= 10;
            }
            return count;
        }

        static int[] getDigits(int n) {
            int count = countDigits(n);
            int[] digits = new int[count];

            for (int i = count - 1; i >= 0; i--) {
                digits[i] = n % 10;
                n /= 10;
            }
            return digits;
        }

        static int[] reverseArray(int[] arr) {
            int n = arr.length;
            int[] rev = new int[n];

            for (int i = 0; i < n; i++)
                rev[i] = arr[n - 1 - i];

            return rev;
        }

        static boolean compareArrays(int[] a, int[] b) {
            if (a.length != b.length)
                return false;

            for (int i = 0; i < a.length; i++)
                if (a[i] != b[i])
                    return false;

            return true;
        }

        static boolean isPalindrome(int n) {
            int[] digits = getDigits(n);
            int[] rev = reverseArray(digits);
            return compareArrays(digits, rev);
        }

        static boolean isDuck(int n) {
            int[] digits = getDigits(n);

            for (int d : digits)
                if (d == 0)
                    return true;

            return false;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            System.out.println("Digits count: " + countDigits(num));
            System.out.println("Palindrome: " + isPalindrome(num));
            System.out.println("Duck number: " + isDuck(num));
        }


}
