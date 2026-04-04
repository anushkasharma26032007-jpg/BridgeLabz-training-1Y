package com.gla.WrapperClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;

public class Prices {
    public static void main(String[] args) {
        double[] prices ={10.5,20.0,35.75,5.5};
        ArrayList<Double> list = new ArrayList<Double>();
        for(double p:prices){
            list.add(p);//autoboxing
        }
        double max = Collections.max(list);
        double sum=0;
        for(double p : list) {
            sum += p;
        }

        System.out.println("Max: " + max);
        System.out.println("Average: " + (sum / list.size()));

    }
}
