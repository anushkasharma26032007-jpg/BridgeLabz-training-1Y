package dailypractice;

import java.util.Scanner;

public class Secondlargestnumberday3 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int []arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if (arr[i] > largest) {

                largest = arr[i];
            }
        }
            for (int i = 0; i < n; i++) {
                if (arr[i] > secondlargest && arr[i] != largest) {
                    secondlargest = arr[i];
                }
            }
            System.out.println("largest is " + largest);
            System.out.println("second largest is " + secondlargest);
        }
}
