package maps.scenarios;
import java.util.*;

public class CourseReg {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("CS101", 45);
        map.put("CS102", 10);
        map.put("CS103", 3);
        map.put("CS104", 55);
        map.put("CS105", 2);

        // add students
        map.put("CS101", map.get("CS101") + 5);
        // drop students but not negative
        map.put("CS103", Math.max(0, map.get("CS103") - 3));

        System.out.println("Near Full (>=50):");
        map.forEach((k,v) -> { if(v >= 50) System.out.println(k + " -> " + v); });

        System.out.println("Under-subscribed (<5):");
        map.forEach((k,v) -> { if(v < 5) System.out.println(k + " -> " + v); });
    }
}
