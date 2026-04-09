package classroomcode;

import java.util.Arrays;
import java.util.Scanner;

public class missingnumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]!=i){
                System.out.println(i);
                return ;
            }
        }
        System.out.println(n);
    }
}
