 import java.util.Scanner;
    class ABCD{
      public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n = sc.nextInt();            	   
        for(int i=65;i<=n;i++){     
        for(int j=65;j<=n;j++){ 
          System.out.print((char)j);
		  }	
          System.out.println();		  
       }
    }
 }
