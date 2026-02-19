package com.gla.methods.level3;
import java.util.Scanner;

public class calendraprogram {

        static String[] months = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};

        static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        static boolean isLeap(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        static int firstDay(int month, int year) {
            int d = 1;
            if (month < 3) {
                month += 12;
                year--;
            }
            int k = year % 100;
            int j = year / 100;
            int h = (d + (13*(month+1))/5 + k + k/4 + j/4 + 5*j) % 7;
            return (h + 6) % 7;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int month = sc.nextInt();
            int year = sc.nextInt();

            System.out.println(months[month-1] + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            int start = firstDay(month, year);
            int totalDays = days[month-1];
            if (month == 2 && isLeap(year))
                totalDays = 29;

            for (int i = 0; i < start; i++)
                System.out.print("    ");

            for (int i = 1; i <= totalDays; i++) {
                System.out.printf("%3d ", i);
                if ((i + start) % 7 == 0)
                    System.out.println();
            }
        }

}
