import java.util.Scanner;
 class nestedifelse{
  public static void main(String[] args){
  Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    if(n%5==0){
        if(n%3==0){
         System.out.println("it is divisible by 5 and 3");
              }
			  else{
			           System.out.println("it is  divisible by 5 but not  3");
					   }
	}
	else{
			System.out.println("it is not divisible ");
			}
	
}
}