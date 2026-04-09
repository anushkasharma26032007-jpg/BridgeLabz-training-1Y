package dailypractice;

import java.util.Scanner;

public class palidromecodeday2 {
  public  static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
      String rev ="";
      for(int i=str.length()-1;i>=0;i--){
          char ch =str.charAt(i);
          rev =rev+ ch;
      }
      if(str.equals(rev)){
          System.out.println("str is a palidrome strimg");
      }
      else{
          System.out.println("it is not an palidrome strimg");
      }
    }
}