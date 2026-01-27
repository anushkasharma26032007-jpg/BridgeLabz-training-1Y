   import java.util.Scanner;

       class highestfactor{
             public static void main(String[] args){
			   Scanner sc = new Scanner (System.in);
                int n = sc.nextInt();  
                   int hf = 1;	
             for(int i=1;i<n;i++){
				 if(n%i ==0)
	            hf =i;
			 }
	          System.out.println(+hf);
	
	}
	}