package dailypractice;

import java.util.Scanner;

public class evenoddarrayday2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int odd =0;
        int even=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("no.of even in a an array "+even);
        System.out.println("no.of odd present in an array is "+odd);
    }
}
