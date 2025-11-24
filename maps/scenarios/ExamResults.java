package maps.scenarios;
import java.util.*;

public class ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> data = new HashMap<>();

        Map<String, Integer> math = new HashMap<>();
        math.put("A", 90); math.put("B", 85); math.put("C", 95);

        Map<String, Integer> sci  = new HashMap<>();
        sci.put("A", 80); sci.put("B", 92); sci.put("C", 88);

        data.put("Math", math);
        data.put("Science", sci);

        for (String sub : data.keySet()) {
            Map<String, Integer> m = data.get(sub);

            String topper = null;
            int max = -1;
            int sum = 0;

            for (var e : m.entrySet()) {
                if (e.getValue() > max) {
                    max = e.getValue();
                    topper = e.getKey();
                }
                sum += e.getValue();
            }

            System.out.println(sub + " Topper = " + topper + " with " + max);
            System.out.println(sub + " Average = " + (sum / m.size()));
        }

        System.out.println("Subjects with marks >90:");
        for (var e : data.entrySet()) {
            for (int mark : e.getValue().values()) {
                if (mark > 90) {
                    System.out.println(e.getKey());
                    break;
                }
            }
        }
    }
}
