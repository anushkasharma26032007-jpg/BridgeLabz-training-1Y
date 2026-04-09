package dailypractice;

import java.util.Scanner;

public class countvowelsinastring {
    static void main() {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        int count =0;
for(int i=0;i<str.length();i++){
    char ch =str.charAt(i);
    if(ch =='A'||ch =='E'||ch=='I'||ch =='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
count++;
    }
}
        System.out.println(count);
    }
}
