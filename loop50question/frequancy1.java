package loop50question;

import java.util.Scanner;

public class frequancy1 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int freq[]=new int[10];
        while(n!=0){
            int  r=n%10;
              freq[r]++;
              n=n/10;
        }
        for(int i=0;i<10;i++){
            if(freq[i]>0){
                System.out.println(i+ " is " + freq[i] + " times");
            }
        }
    }
}
