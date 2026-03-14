import java.util.Scanner;
    class palidrome2 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
 		int n=sc.nextInt();
		int temp=n;
		int r=0;
        while (n>0) { 
		   r=r*10+n%10; 		  
		   n=n/10;
        }
		if(temp==r)
		{
		System.out.println("Palidrome");
		}else{
		System.out.println("not palidrome");
		}
    }
}
