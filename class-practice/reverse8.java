import java.util.Scanner;
class reverse8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String or="";
        char ch;
        for(int i=0;i<str.length();i++){
           ch=str.charAt(i);
           or = or+ch;
        }
        System.out.println(or);
    }
}
