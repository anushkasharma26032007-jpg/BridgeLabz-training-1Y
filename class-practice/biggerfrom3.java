import java.util.Scanner;
class biggerfrom3{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if (a>b && a>c){
System.out.println("it is biggerfrom3" + a);
}
else if (b>a && b>c){
System.out.println("it is biggerfrom3" + b);
}
else if(c>a && c>b){
System.out.println("it is biggerfrom3" + c);
}
}
}