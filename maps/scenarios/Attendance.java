package maps.scenarios;
import java.util.*;

public class Attendance {
    public static void main(String[] args) {
        List<String> students = List.of("A","B","C","D","E");
        Map<String, Integer> present = new HashMap<>();

        for (String s : students) present.put(s, 0);

        Random r = new Random(1); // fixed seed for reproducibility

        for (int day = 1; day <= 15; day++) {
            // simulate present students for the day
            for (String s : students) {
                if (r.nextBoolean())
                    present.put(s, present.get(s) + 1);
            }
        }

        System.out.println("Attendance counts: " + present);

        System.out.println("Under 10 days:");
        for (var e : present.entrySet()) {
            if (e.getValue() < 10)
                System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
