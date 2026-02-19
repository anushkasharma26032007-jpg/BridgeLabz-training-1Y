package com.gla.String.level2;
import java.util.*;

public class studentpcmmarksandgrade {

        public static int[][] generateMarks(int n) {
            int[][] marks = new int[n][3];
            for (int i=0;i<n;i++)
                for (int j=0;j<3;j++)
                    marks[i][j] = (int)(Math.random()*100);
            return marks;
        }

        public static double[][] calculate(int[][] marks) {
            int n = marks.length;
            double[][] result = new double[n][3];

            for (int i=0;i<n;i++) {
                int total = marks[i][0]+marks[i][1]+marks[i][2];
                double avg = total/3.0;
                double percent = avg;
                result[i][0]=total;
                result[i][1]=Math.round(avg*100.0)/100.0;
                result[i][2]=Math.round(percent*100.0)/100.0;
            }
            return result;
        }

        public static String grade(double percent) {
            if (percent>=90) return "A";
            if (percent>=75) return "B";
            if (percent>=60) return "C";
            if (percent>=40) return "D";
            return "F";
        }

        public static void main(String[] args) {
            int n = 5;
            int[][] marks = generateMarks(n);
            double[][] result = calculate(marks);

            for (int i=0;i<n;i++) {
                System.out.println(
                        marks[i][0]+" "+marks[i][1]+" "+marks[i][2]+" | "+
                                result[i][0]+" "+result[i][1]+" "+result[i][2]+" | "+
                                grade(result[i][2])
                );
            }
        }

}
