import java.util.Scanner;
class ifelse{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
if (n>90){
System.out.println("Exellent");
}
else if (n>80){
System.out.println("very good");
}
else if(n>70){
System.out.println("good");
}
else if(n>60){
System.out.println("can do better");
}
else if(n>50){
System.out.println("Average");
}
else if(n>40){
System.out.println("Below average");
}
else {
System.out.println("Fail");
}
}
}







