package StreamAPI;
import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean weekend;

    Doctor(String name, String specialty, boolean weekend) {
        this.name = name;
        this.specialty = specialty;
        this.weekend = weekend;
    }
}

public class DoctorAvailable {

    public static void main(String[] args) {

        List<Doctor> list = Arrays.asList(
                new Doctor("Dr j", "Cardio", true),
                new Doctor("Dr x", "Neuro", false),
                new Doctor("Dr z", "Ortho", true)
        );

        list.stream()
                .filter(d -> d.weekend)
                .sorted((a, b) -> a.specialty.compareTo(b.specialty))
                .forEach(d -> System.out.println(d.name + " " + d.specialty));
    }
}
