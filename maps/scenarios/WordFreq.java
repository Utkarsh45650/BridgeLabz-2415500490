package maps.scenarios;
import java.util.*;

public class WordFreq {
    public static void main(String[] args) {
        String s = "Java is fun and Java is powerful";

        s = s.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = s.split("\\s+");

        Map<String, Integer> freq = new HashMap<>();

        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        System.out.println(freq);
    }
}
