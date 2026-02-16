class passingstringtomethod{
public static void change(String x){
x="anushka";
}
public static void main(String[] args){
String x="sharmaji";
System.out.println(x);
change(x);
System.out.println(x);
}
}