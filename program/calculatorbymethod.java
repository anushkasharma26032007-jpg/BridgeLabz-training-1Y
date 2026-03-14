import java.util.Scanner;
class calculatorbymethod{
//method for addition
static int add(int a,int b){
return a + b;
}
//method for subtract
static int subtract(int a,int b){
return a - b;
}
//method for multiplication
static int multiply(int a,int b){
return a * b;
}
//method for divide
static int divide(int a,int b){
return a / b;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Addition="+add(a, b));
System.out.println("Substract="+subtract(a, b));
System.out.println("Mutiply="+multiply(a, b));
System.out.println("Devide="+divide(a, b));
}
}




