package maps.scenarios;
import java.util.*;

public class EmpDept {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "HR");
        map.put(2, "IT");
        map.put(3, "Finance");
        map.put(4, "IT");
        map.put(5, "HR");

        // change dept of 3 to IT
        map.put(3, "IT");

        System.out.println("Employees in IT:");
        for (var e : map.entrySet()) {
            if (e.getValue().equals("IT"))
                System.out.println(e.getKey());
        }

        Map<String, Integer> count = new HashMap<>();
        for (var e : map.entrySet()) {
            count.put(e.getValue(), count.getOrDefault(e.getValue(), 0) + 1);
        }

        System.out.println("Total employees per department: " + count);
    }
}
