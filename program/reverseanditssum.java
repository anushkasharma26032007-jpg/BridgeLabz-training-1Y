//pattern
import java.util.Scanner;
class reverseanditssum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num=n;
int sum,rem,rev=0;
while(n>0)
{
 rem=n%10;
rev=rev*10+rem;
n=n/10;
}
sum=num+rev;
System.out.println(sum);
}
}