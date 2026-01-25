import java.util.Scanner;
  class pointposition{
   public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
     int x = sc.nextInt();
     int y = sc.nextInt();
	 int r = sc.nextInt();
	 int x1 = sc.nextInt();
	 int y1 = sc.nextInt();
     int ds = (x1-x)*(x1-x)+ (y1-y)*(y1-y);
	 int rs = r*r;
	 
      if (ds < rs){
       System.out.println("point lies inside the circle");
                     }
     else if (ds == rs){
       System.out.println("center of the circle");
                  }
      else if(ds > rs){
         System.out.println("outside the circles");
                  }
			  }
			  }
			