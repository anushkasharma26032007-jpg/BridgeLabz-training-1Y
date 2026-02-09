class stringmethodsdemo{
public static void main(String[] args){
String s="java programming";
//length()
System.out.println(s.length());//16
//touppercase()
System.out.println(s.touppercase());//JAVA PROGRAMMING
//tolowercase
System.out.println(s.tolowercase());//java programming
//charAt()
System.out.println(s.charAt(5));//println
//substring()
System.out.println(s.substring(5));//programming
System.out.println(s.substring(0,4));//java
//contains()
System.out.println(s.contains("java"));//true
//eqauls()
System.out.println(s.eqauls("java programming"));//true
}
}