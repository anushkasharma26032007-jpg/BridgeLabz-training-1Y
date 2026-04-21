package StreamAPI;
import java.util.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
}
public class trend5movie {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("y", 4.5, 2022),
                new Movie("f", 4.8, 2023),
                new Movie("k", 4.2, 2021),
                new Movie("l", 4.9, 2024),
                new Movie("p", 4.7, 2022),
                new Movie("x", 4.6, 2023)
        );

        movies.stream()
                .filter(m -> m.year >= 2022)
                .sorted((a, b) -> Double.compare(b.rating, a.rating))
                .limit(5)
                .forEach(m -> System.out.println(m.name + " " + m.rating));
    }
}
