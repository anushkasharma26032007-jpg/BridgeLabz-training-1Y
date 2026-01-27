import java.util.Scanner;
          class  primedifferent{
                public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
	                	int n= sc.nextInt();
                      boolean flag = false ;//false seen prime            	                     			   		        
		            for(int i=2;i<n;i++){
             		if(n%i ==0){//i is factor of n
                    flag = true;//true seen composite  
                      break;					
		             }
			     	  }
	     	         if(n==1)
		   		  System.out.println("neither prime nor composite");		          
		            else if (flag == false)
		   		   		  System.out.println(" prime number");	
						    else 
			   		   		  System.out.println("  composite  number");	
		                                        }
		                        }
		
