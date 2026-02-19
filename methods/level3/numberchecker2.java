package com.gla.methods.level3;
import java.util.Scanner;
public class numberchecker2 {

        static int[] getDigits(int n) {
            String s = String.valueOf(n);
            int[] d = new int[s.length()];
            for (int i = 0; i < s.length(); i++)
                d[i] = s.charAt(i) - '0';
            return d;
        }

        static int sumDigits(int[] d) {
            int s = 0;
            for (int x : d) s += x;
            return s;
        }

        static double sumSquares(int[] d) {
            double s = 0;
            for (int x : d) s += Math.pow(x, 2);
            return s;
        }

        static boolean isHarshad(int n, int[] d) {
            return n % sumDigits(d) == 0;
        }

        static int[][] frequency(int[] d) {
            int[][] freq = new int[10][2];
            for (int i = 0; i < 10; i++) {
                freq[i][0] = i;
                freq[i][1] = 0;
            }

            for (int x : d)
                freq[x][1]++;

            return freq;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int[] digits = getDigits(n);

            System.out.println("Sum: " + sumDigits(digits));
            System.out.println("Sum Squares: " + sumSquares(digits));
            System.out.println("Harshad: " + isHarshad(n, digits));

            int[][] freq = frequency(digits);
            for (int i = 0; i < 10; i++)
                if (freq[i][1] > 0)
                    System.out.println(i + " -> " + freq[i][1]);
        }

}
