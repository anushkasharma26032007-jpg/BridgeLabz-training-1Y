 import java.util.Scanner;
class powerofnumber{
 public static void main(String[] args){
 Scanner sc= new Scanner(System.in);
 int n = sc.nextInt();
 int p= sc.nextInt();
 int r=1;
 for(int i=1;i<=p;i++){
  r=r*n;
 }
 System.out.println(r);
 
 }
 }

