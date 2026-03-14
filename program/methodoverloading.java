class methodoverloading {
    int sum(int a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
	 double add(double b,double c,double d){
		return b+c+d;
	 }
    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        System.out.println(obj.sum(2, 3));      
        System.out.println(obj.sum(2, 3, 4)); 
		 System.out.println(obj.add(2, 3, 4)); 
    }
}
