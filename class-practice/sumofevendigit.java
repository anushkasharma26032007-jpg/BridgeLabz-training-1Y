//pattern
import java.util.Scanner;
class sumofevendigit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0,r;
while(n>0){
	r=n%10;
if(r % 2 == 0){
sum=sum+r;
}
n=n/10;
}
System.out.println(sum);
}
}