package com.gla.Generics.JavaCollection;
import java.util.*;

class Player {
    String name;

    Player(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player p = (Player) o;
        return name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return name;
    }
}

class Match {
    String team1, team2;

    Match(String t1, String t2) {
        this.team1 = t1;
        this.team2 = t2;
    }

    public String toString() {
        return team1 + " vs " + team2;
    }
}

class Result {
    String winner;

    Result(String winner) {
        this.winner = winner;
    }

    public String toString() {
        return "Winner: " + winner;
    }
}

class Score implements Comparable<Score> {
    String player;
    int points;

    Score(String player, int points) {
        this.player = player;
        this.points = points;
    }

    public int compareTo(Score s) {
        return s.points - this.points;
    }

    public String toString() {
        return player + " : " + points;
    }
}
public class OnlineGamingTournamentTracker {
    public static void main(String[] args) {

        Set<Player> players = new HashSet<>();
        players.add(new Player("A"));
        players.add(new Player("B"));
        players.add(new Player("C"));

        Queue<Match> matches = new LinkedList<>();
        matches.add(new Match("A", "B"));
        matches.add(new Match("B", "C"));

        List<Result> results = new ArrayList<>();

        TreeSet<Score> leaderboard = new TreeSet<>();

        while (!matches.isEmpty()) {
            Match m = matches.poll();
            System.out.println("Match: " + m);

            String winner = m.team1;
            results.add(new Result(winner));

            leaderboard.add(new Score(winner, new Random().nextInt(100)));
        }

        System.out.println("Results:");
        for (Result r : results) {
            System.out.println(r);
        }

        System.out.println("Leaderboard:");
        for (Score s : leaderboard) {
            System.out.println(s);
        }
    }
}
