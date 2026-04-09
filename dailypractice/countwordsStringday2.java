package dailypractice;

import java.util.Scanner;

public class countwordsStringday2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String str =sc.nextLine().trim();
         if(str.isEmpty()){
             System.out.println("words = 0");
             return;
         }
         String words[] =str.split("\\s");
        System.out.println("words length "+words.length);

    }
}
