package com.gla.String.level2;
import java.util.*;
public class rockpaperscissors {
        public static String computerChoice() {
            int n = (int)(Math.random()*3);
            if (n==0) return "rock";
            if (n==1) return "paper";
            return "scissors";
        }

        public static int winner(String user, String comp) {
            if (user.equals(comp)) return 0;
            if (user.equals("rock") && comp.equals("scissors")) return 1;
            if (user.equals("paper") && comp.equals("rock")) return 1;
            if (user.equals("scissors") && comp.equals("paper")) return 1;
            return -1;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int games = sc.nextInt();
            int userWin=0, compWin=0;

            for (int i=0;i<games;i++) {
                String user = sc.next();
                String comp = computerChoice();
                int result = winner(user, comp);
                if (result==1) userWin++;
                else if (result==-1) compWin++;
            }

            System.out.println("User Wins: " + userWin);
            System.out.println("Computer Wins: " + compWin);
            System.out.println("User %: " + (userWin*100.0/games));
            System.out.println("Computer %: " + (compWin*100.0/games));
        }

}
