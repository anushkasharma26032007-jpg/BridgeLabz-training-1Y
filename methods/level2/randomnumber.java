package com.gla.methods.level2;

public class randomnumber {

        static int[] generate4DigitRandomArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++)
                arr[i] = 1000 + (int)(Math.random() * 9000);
            return arr;
        }

        static double[] findAverageMinMax(int[] numbers) {
            int sum = 0;
            int min = numbers[0];
            int max = numbers[0];

            for (int n : numbers) {
                sum += n;
                min = Math.min(min, n);
                max = Math.max(max, n);
            }

            double avg = (double) sum / numbers.length;
            return new double[]{avg, min, max};
        }

        public static void main(String[] args) {
            int[] arr = generate4DigitRandomArray(5);
            for (int x : arr) System.out.print(x + " ");

            double[] res = findAverageMinMax(arr);
            System.out.println("\nAverage: " + res[0]);
            System.out.println("Min: " + res[1]);
            System.out.println("Max: " + res[2]);
        }

}
