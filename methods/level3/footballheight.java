package com.gla.methods.level3;

public class footballheight {


        static int[] generateHeights() {
            int[] heights = new int[11];
            for (int i = 0; i < heights.length; i++)
                heights[i] = 150 + (int)(Math.random() * 101);
            return heights;
        }

        static int sum(int[] arr) {
            int s = 0;
            for (int x : arr) s += x;
            return s;
        }

        static double mean(int[] arr) {
            return (double) sum(arr) / arr.length;
        }

        static int min(int[] arr) {
            int m = arr[0];
            for (int x : arr)
                if (x < m) m = x;
            return m;
        }

        static int max(int[] arr) {
            int m = arr[0];
            for (int x : arr)
                if (x > m) m = x;
            return m;
        }

        public static void main(String[] args) {
            int[] heights = generateHeights();

            System.out.print("Heights: ");
            for (int h : heights) System.out.print(h + " ");

            System.out.println("\nShortest: " + min(heights));
            System.out.println("Tallest: " + max(heights));
            System.out.println("Mean: " + mean(heights));
        }

}
