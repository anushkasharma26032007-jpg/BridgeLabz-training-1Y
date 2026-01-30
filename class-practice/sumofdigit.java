import java.util.Scanner;
class sumofdigit{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int sum = 0;
while(n>0){
int lastdigit = n%10;
n = n/10;
sum = sum+lastdigit;
}
System.out.println(sum);
}
}
