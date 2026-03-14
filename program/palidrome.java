import java.util.Scanner;
   class palidrome{
       public static void main(String[] args){
           Scanner sc= new Scanner(System.in);
          int n = sc.nextInt();
             int temp = n;
            int rev=0;
            while(n!=0)
			{
			rev = rev*10 + n%10;
			n = n/10;
			}
			System.out.println(+rev);
			if(temp==rev)
			{
			System.out.println("palidrome");
			}
			else{
			System.out.println("not palidrome");
			}
			}
			}
