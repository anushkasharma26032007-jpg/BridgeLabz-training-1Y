class coursefeediscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;
		double discountamount = fee*(discountPercent / 100);
		double discountedfee = fee - discountamount;
		System.out.println("The discount Amount is INR " + discountamount + "and  the final discounted fee is INR " + discountedfee);
		}
		}