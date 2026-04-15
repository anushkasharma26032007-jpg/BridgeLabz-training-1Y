package classroomcode.question;

import java.util.*;

public class Duplicateelements {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
         list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(50);
        System.out.println("...............Original list........."+list);
       Set<Integer> set = new HashSet<>(list);
       ArrayList<Integer> uniquelist =new ArrayList<>(set);
        System.out.println("............unique list............"+uniquelist);
       }
      }