//pattern
import java.util.Scanner;
class reverse6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n>0)
{
int r=n%10;
System.out.println(r);
n=n/10;
}
}
}