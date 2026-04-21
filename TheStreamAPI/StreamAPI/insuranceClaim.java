package StreamAPI;
import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class insuranceClaim {

    public static void main(String[] args) {

        List<Claim> list = Arrays.asList(
                new Claim("Health", 5083),
                new Claim("Health", 7092),
                new Claim("Car", 3084),
                new Claim("Car", 40498)
        );

        Map<String, Double> avg = list.stream()
                .collect(Collectors.groupingBy(c -> c.type,
                        Collectors.averagingDouble(c -> c.amount)));

        System.out.println(avg);
    }
}
