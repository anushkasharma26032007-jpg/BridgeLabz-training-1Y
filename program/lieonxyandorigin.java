import java.util.Scanner;
  class lieonxyandorigin{
   public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
     int x = sc.nextInt();
     int y = sc.nextInt();
      if (x==0 && y==0){
       System.out.println("lie on origin");
                     }
     else if (x==0){
       System.out.println("lie on y-axis");
                  }
      else if(y==0){
         System.out.println("lie on x-axis");
                  }
			  }
			  }