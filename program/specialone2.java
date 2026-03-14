import java.util.Scanner;
class specialone2{
public static void main(String[] args){
String str=sc.nextLine();
int upper=0;int lower=0;int digit=0;int special=0;
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
if(ch>='A' && ch<='Z'){
upper++;
}
else if(ch>='a'&& ch<='z'){
lower++;
}
else if(ch>='0' && ch<='9'){
digit++;
}
else{
special++
}
}
System.out.println(+upper);
System.out.println(+lower);
System.out.println(+digit);
System.out.println(+special);
}
}

