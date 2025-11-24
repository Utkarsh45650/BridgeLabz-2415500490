package maps.scenarios;
import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>();

        grades.put("Rohan", 85.0);
        grades.put("Sita", 92.0);
        grades.put("Aman", 78.0);

        // update Rohan
        grades.put("Rohan", 90.0);

        // remove Aman
        grades.remove("Aman");

        // iterate sorted by name (TreeMap)
        for (var e : grades.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
