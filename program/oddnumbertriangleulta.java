 import java.util.Scanner;
    class oddnumbertriangleulta{
     public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();            		  
         for(int i=1;i<=n;i++){	 
		  int num=1;
         for(int j=1;j<=n+1-i;j++){
		
           System.out.print(num);
		   num=num+2;
		   }
          System.out.println();		        
		 }
	}
	}