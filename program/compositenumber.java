import java.util.Scanner;
          class compositenumber{
                public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
	                	int n= sc.nextInt();
                 		int count =1;
             		if(n<=1){
	  		        	  System.out.println("Composite number");
                     }				
     		        else{
		            for(int i=1;i<=n;i++){
             		if(n%i ==0){
		     		count++;
		            }
		          }
		           if(count>2){
		     		  System.out.println("composite number");
		          }  
		            else{
		   		   		  System.out.println(" not composite number");

		           }
		            }
		                                        }
		                        }
		
		