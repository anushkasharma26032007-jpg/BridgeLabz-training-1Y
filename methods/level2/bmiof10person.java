package com.gla.methods.level2;
import java.util.Scanner;
public class bmiof10person {

        static double calculateBMI(double weight, double heightCm) {
            double heightM = heightCm / 100;
            return weight / (heightM * heightM);
        }

        static String getStatus(double bmi) {
            if (bmi < 18.5) return "Underweight";
            if (bmi < 25) return "Normal";
            if (bmi < 30) return "Overweight";
            return "Obese";
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[][] data = new double[10][3];

            for (int i = 0; i < 10; i++) {
                data[i][0] = sc.nextDouble();
                data[i][1] = sc.nextDouble();
                data[i][2] = calculateBMI(data[i][0], data[i][1]);
            }

            for (int i = 0; i < 10; i++) {
                System.out.println(data[i][0] + " " + data[i][1] + " " +
                        data[i][2] + " " + getStatus(data[i][2]));
            }
        }
}
