package com.gla.methods.level3;
import java.util.Scanner;
public class numberchecker {


        static int countDigits(int n) {
            return String.valueOf(n).length();
        }

        static int[] getDigits(int n) {
            String s = String.valueOf(n);
            int[] d = new int[s.length()];
            for (int i = 0; i < s.length(); i++)
                d[i] = s.charAt(i) - '0';
            return d;
        }

        static boolean isDuck(int[] d) {
            for (int x : d)
                if (x == 0) return true;
            return false;
        }

        static boolean isArmstrong(int n, int[] d) {
            int sum = 0;
            int p = d.length;
            for (int x : d)
                sum += Math.pow(x, p);
            return sum == n;
        }

        static int[] largestTwo(int[] d) {
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for (int x : d) {
                if (x > first) {
                    second = first;
                    first = x;
                } else if (x > second && x != first) {
                    second = x;
                }
            }
            return new int[]{first, second};
        }

        static int[] smallestTwo(int[] d) {
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;

            for (int x : d) {
                if (x < first) {
                    second = first;
                    first = x;
                } else if (x < second && x != first) {
                    second = x;
                }
            }
            return new int[]{first, second};
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int[] digits = getDigits(n);

            System.out.println("Digits: " + countDigits(n));
            System.out.println("Duck: " + isDuck(digits));
            System.out.println("Armstrong: " + isArmstrong(n, digits));

            int[] large = largestTwo(digits);
            int[] small = smallestTwo(digits);

            System.out.println("Largest: " + large[0] + " Second: " + large[1]);
            System.out.println("Smallest: " + small[0] + " Second: " + small[1]);
        }

}
