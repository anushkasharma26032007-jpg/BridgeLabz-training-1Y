package com.gla.Generics.Genericsproblemset;
import java.util.*;
public class Numericsum {


    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
