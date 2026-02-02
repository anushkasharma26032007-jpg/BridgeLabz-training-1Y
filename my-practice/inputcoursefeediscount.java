import java.util.Scanner;
class inputcoursefeediscount {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        double fee = sc.nextDouble();
        double discountPercent = sc.nextDouble();
		double discountamount = fee*(discountPercent / 100);
		double discountedfee = fee - discountamount;
		System.out.println("The discount Amount is INR " + discountamount + "and  the final discounted fee is INR " + discountedfee);
		}
		}