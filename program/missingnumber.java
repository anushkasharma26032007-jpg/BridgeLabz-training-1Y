import java.util.Scanner;
class missingnumber{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
System.out.println("Enter index");
int n=sc.nextInt();
int []arr=new int[n];
int totalsum=0;
for(int i=0;i<n;i++){
System.out.println("Enter number");
 arr[i]=sc.nextInt();
totalsum=totalsum+arr[i];
}
int Expected_no= n+1;
int output=Expected_no*(Expected_no+1)/2;
int missing =output-totalsum;
System.out.println("missingnumber"+missing);
}
}