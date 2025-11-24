package maps.scenarios;
import java.util.*;

public class VisitTracker {
    public static void main(String[] args) {
        Map<String, Integer> visits = new HashMap<>();

        String[] pages = {"home","about","products","home","products","contact","home","products","home"};

        for (String p : pages) {
            visits.put(p, visits.getOrDefault(p, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(visits.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        System.out.println("Sorted visits (desc):");
        list.forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        System.out.println("Most visited = " + list.get(0).getKey());
    }
}
