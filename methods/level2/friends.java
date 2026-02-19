package com.gla.methods.level2;
import java.util.Scanner;
public class friends {


        static int findMinIndex(int[] arr) {
            int idx = 0;
            for (int i = 1; i < arr.length; i++)
                if (arr[i] < arr[idx]) idx = i;
            return idx;
        }

        static int findMaxIndex(int[] arr) {
            int idx = 0;
            for (int i = 1; i < arr.length; i++)
                if (arr[i] > arr[idx]) idx = i;
            return idx;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] names = {"Amar", "Akbar", "Anthony"};
            int[] ages = new int[3];
            int[] heights = new int[3];

            for (int i = 0; i < 3; i++) ages[i] = sc.nextInt();
            for (int i = 0; i < 3; i++) heights[i] = sc.nextInt();

            System.out.println("Youngest: " + names[findMinIndex(ages)]);
            System.out.println("Tallest: " + names[findMaxIndex(heights)]);
        }

}
