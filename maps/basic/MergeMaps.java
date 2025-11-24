package maps.basic;
import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("A", 1); m1.put("B", 2);
        Map<String, Integer> m2 = new HashMap<>();
        m2.put("B", 3); m2.put("C", 4);

        Map<String, Integer> result = new HashMap<>(m1);

        for (var e : m2.entrySet()) {
            result.put(e.getKey(), result.getOrDefault(e.getKey(), 0) + e.getValue());
        }

        System.out.println(result);
    }
}
