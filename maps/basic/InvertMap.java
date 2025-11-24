package maps.basic;
import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> original = new HashMap<>();
        original.put("A", 1);
        original.put("B", 2);
        original.put("C", 1);

        Map<Integer, List<String>> inverted = new HashMap<>();

        for (Map.Entry<String, Integer> e : original.entrySet()) {
            inverted.putIfAbsent(e.getValue(), new ArrayList<>());
            inverted.get(e.getValue()).add(e.getKey());
        }

        System.out.println(inverted);
    }
}
