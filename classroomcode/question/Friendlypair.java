package classroomcode.question;

import java.util.Scanner;

public class Friendlypair {
    public static void main(String[] args) {
        int a = 6, b = 28;
        int s1 = 0, s2 = 0;

        for(int i = 1; i <= a/2; i++)
            if(a % i == 0) s1 += i;

        for(int i = 1; i <= b/2; i++)
            if(b % i == 0) s2 += i;

        if((double)s1/a == (double)s2/b)
            System.out.println("Friendly Pair");
        else
            System.out.println("Not Friendly Pair");
    }
}
