package loop50question;
import java.util.Scanner;
public class secondlargestelement {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int second_largestno=arr[0];
        for(int i=1;i<n;i++) {
            if (arr[i] >largest) {
                second_largestno=largest;
                largest =arr[i];
            }
            else if(arr[i]>largest && arr[i]!= largest){
                second_largestno=arr[i];
            }
        }
            System.out.println(+second_largestno);
    }
}
