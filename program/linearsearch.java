import java.util.Scanner;
class linearsearch{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++){
 arr[i]=sc.nextInt();
}
int x=7;
for(int i=0;i<n;i++){
	if(arr[i]==x){
		System.out.println("mil gaya");
	}
}
}
}
