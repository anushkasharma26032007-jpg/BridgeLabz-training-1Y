package StreamAPI;
import java.util.*;
import java.time.*;
public class loggingtransaction {

    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(101, 102, 103);

        ids.forEach(id ->
                System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}
