package dailypractice;
import java.util.Scanner;
class sumofarray{
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
public class sumofmethodusingarrayday2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      int result = sumofarray.sum(arr);
        System.out.println(result);
    }
}
