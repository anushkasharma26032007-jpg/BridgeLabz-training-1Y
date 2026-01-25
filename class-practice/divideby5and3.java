import java.util.Scanner;
class divideby5and3{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
if(n%5==0 && n%3==0){
System.out.println("yes");
}
else{
	System.out.println("no");
}
}
}