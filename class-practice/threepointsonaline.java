import java.util.Scanner;
 class threepointsonaline{
  public static void main(String[] args){
  Scanner sc = new Scanner (System.in);
    double x1 = sc.nextDouble();
	    double x2 = sc.nextDouble();
         double x3 = sc.nextDouble();
           double y1 = sc.nextDouble();
		    double y2 = sc.nextDouble();
		      double y3 = sc.nextDouble();
			    double m1 =( y2-y1)/(x2-x1);
						double m2 =( y3-y2)/(x3-x2);
	                    if(m1==m2){       
                           System.out.println("three points on a single line");
                                   }
			           else{
			           System.out.println("not");
					   }	
}
}