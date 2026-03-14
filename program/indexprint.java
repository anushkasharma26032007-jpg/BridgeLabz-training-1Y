import java.util.Scanner;
class indexprint{
public static void main(String[] args){
int[]marks={100,90,85,95,17,36,35,7};
for(int i=0;i<marks.length;i++){
if(marks[i]<35){
	System.out.print(i+" ");
}
}
}
}