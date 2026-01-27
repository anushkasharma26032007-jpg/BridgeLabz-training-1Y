   import java.util.Scanner;
       class volumeofearth{
             public static void main(String[] args){
			   Scanner sc = new Scanner (System.in);
                 double pi = 3.14;
				 double r1 =6378;
                 double volumeofearthinkm = (4/3)*pi*r1*r1*r1;
				 double r2 = r1*0.621;
                 double volumeofearthinmiles = (4/3)*pi*r2*r2*r2; 
	              System.out.println("the volume of earth in km" + volumeofearthinkm +
				  "the volume of earth in miles" +volumeofearthinmiles);
	
	}
	}