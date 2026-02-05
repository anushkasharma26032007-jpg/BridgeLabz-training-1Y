import java.util.Scanner;
    class chartrianglereverse{
         public static void main(String[] args){
         Scanner sc=new Scanner(System.in);		
          int n = sc.nextInt(); 
         for(int i=1;i<=n;i++){	 
         for(int j=1;j<=n-i;j++){	//spaces		 
				 System.out.print(" "+" ");
		     }
			 for(int j=1;j<=i;j++){ //number
		      System.out.print((char)(j+64)+" ");
				 
	    	 }
          System.out.println();
	}
	}
		 }