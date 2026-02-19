package com.gla.methods.level2;

public class unitconvertor3 {

        static double fToC(double f) { return (f - 32) * 5 / 9; }
        static double cToF(double c) { return (c * 9 / 5) + 32; }
        static double poundsToKg(double p) { return p * 0.453592; }
        static double kgToPounds(double k) { return k * 2.20462; }
        static double gallonsToLiters(double g) { return g * 3.78541; }
        static double litersToGallons(double l) { return l * 0.264172; }

        public static void main(String[] args) {
            System.out.println(fToC(100));
            System.out.println(cToF(37));
            System.out.println(poundsToKg(10));
            System.out.println(kgToPounds(5));
            System.out.println(gallonsToLiters(2));
            System.out.println(litersToGallons(5));
        }

}
