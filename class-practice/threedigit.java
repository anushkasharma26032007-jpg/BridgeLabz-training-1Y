import java.util.Scanner;
class threedigit{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
if(n>99 && n<1000){
System.out.println("yes");
}
else{
	System.out.println("no");
}

}
}