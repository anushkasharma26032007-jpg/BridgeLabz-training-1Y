package loop50question;

import java.util.Scanner;

public class swapfirstandlastdigit {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int divisor=1;
        while(temp>=10){
             temp=temp/10;
            divisor=divisor*10;
        }
        int first=temp;
        int last=n%10;
        int middle=(n%divisor)/10;
        int result=last*divisor+middle*10+first;
        System.out.println(result);
    }
}
