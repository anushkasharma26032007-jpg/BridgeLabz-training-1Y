  import java.util.Scanner;
       class primenumber{
             public static void main(String[] args){
			   Scanner sc = new Scanner (System.in);
                int n = sc.nextInt();
                     int count =0;	
					 if(n <= 1){
 				      System.out.println("its  not primenumber");
					     }
						 else{
                      for(int i = 1;i <= n;i++)
                         {	 if(n%i == 0){
				          count++;
						 }
                       }				              
                        if(count ==2){
				      System.out.println("its primenumber");
				             }  else   {
				      System.out.println("its  not primenumber");
					  }
	            }
			    }
				}