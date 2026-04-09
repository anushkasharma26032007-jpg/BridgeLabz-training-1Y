package dailypractice;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class duplicateelementday3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int duplicate=arr[0];
        System.out.println("Duplicate no is ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                  duplicate =arr[i];
                    System.out.println(duplicate);
                  break;
                }
            }
        }
    }
}
