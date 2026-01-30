import java.util.Scanner;
    class fibanocci{
      public static void main(String[] args) {
		  		
         Scanner sc=new Scanner(System.in); 
 		int n=sc.nextInt();	

		int a=0,b=1;
        int i=1;		
		while(i<=n){
		System.out.println(a+" ");
		int c=a+b;
		a=b;
		b=c;
		i++;
        }
		
		
    }
}
