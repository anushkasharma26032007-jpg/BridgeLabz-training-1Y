import java.util.Scanner;
    class reverse5 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
 		int n=sc.nextInt();
		int r=0;
        while (n>0) { 
		   r=r*10+n%10; 		  
		   n=n/10;
		   n++;
        }
		System.out.println(r);
    }
}
