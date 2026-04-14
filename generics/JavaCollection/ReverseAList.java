package com.gla.Generics.JavaCollection;
import java.util.*;
public class ReverseAList {



        public static void main(String[] args) {

            List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

            reverse(list);
            System.out.println(list); // [5,4,3,2,1]
        }

        public static <T> void reverse(List<T> list) {
            int left = 0;
            int right = list.size() - 1;

            while (left < right) {
                T temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);

                left++;
                right--;
            }
        }
    }

