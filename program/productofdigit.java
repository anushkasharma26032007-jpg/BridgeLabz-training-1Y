//pattern
import java.util.Scanner;
class productofdigit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int product=1;
while(n>0)
{
int r=n%10;
product=product*r;
n=n/10;
}
System.out.println(product);

}
}