package com.gla.methods.level3;

public class zarabonusprogram {

        static int[][] generateData() {
            int[][] data = new int[10][2];
            for (int i = 0; i < 10; i++) {
                data[i][0] = (int)(Math.random()*90000)+10000;
                data[i][1] = (int)(Math.random()*10)+1;
            }
            return data;
        }

        static double[][] calculateBonus(int[][] data) {
            double[][] result = new double[10][2];
            for (int i = 0; i < 10; i++) {
                double bonus = data[i][1] > 5 ? data[i][0]*0.05 : data[i][0]*0.02;
                result[i][0] = data[i][0] + bonus;
                result[i][1] = bonus;
            }
            return result;
        }

        public static void main(String[] args) {
            int[][] data = generateData();
            double[][] result = calculateBonus(data);

            double totalOld=0,totalNew=0,totalBonus=0;

            for(int i=0;i<10;i++){
                totalOld+=data[i][0];
                totalNew+=result[i][0];
                totalBonus+=result[i][1];
            }

            System.out.println("Total Old Salary: "+totalOld);
            System.out.println("Total New Salary: "+totalNew);
            System.out.println("Total Bonus: "+totalBonus);
        }

}
