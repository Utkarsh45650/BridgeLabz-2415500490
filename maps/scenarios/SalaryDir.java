package maps.scenarios;
import java.util.*;

public class SalaryDir {
    public static void main(String[] args) {
        Map<String, Double> sal = new HashMap<>();

        sal.put("A", 50000.0);
        sal.put("B", 70000.0);
        sal.put("C", 60000.0);
        sal.put("D", 55000.0);
        sal.put("E", 90000.0);
        sal.put("F", 75000.0);

        // give raise to C by 10%
        String emp = "C";
        if (sal.containsKey(emp)) {
            sal.put(emp, sal.get(emp) * 1.10);
        } else {
            System.out.println("Employee not found");
        }

        double sum = 0;
        for (double s : sal.values()) sum += s;
        System.out.println("Average = " + sum / sal.size());

        double max = Collections.max(sal.values());
        System.out.println("Highest-paid employees:");
        for (var e : sal.entrySet()) {
            if (e.getValue() == max) System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
