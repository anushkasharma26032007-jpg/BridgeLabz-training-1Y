import java.util.Scanner;
class prime{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int count = 0s;
if(n<=1){
System.out.println("it's not prime number");
}
else{
for(int i=1;i<=n;i++)
if(n%i==0){
count++;
}
else if(count==2){
System.out.println("it's prime number");
}
else{
System.out.println("it's not prime number");
}
}
}
}

