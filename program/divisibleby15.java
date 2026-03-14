import java.util.Scanner;
 class divisibleby15{
  public static void main(String[] args){
  Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    if(n%5==0 || n%3==0){
        if(n%15!=0){
         System.out.println("it is divisible ");
              }
			  else{
			           System.out.println("it is  divisible by 15");
					   }
	}
	else{
			System.out.println("it is not divisible by any of them");
			}
	
}
}