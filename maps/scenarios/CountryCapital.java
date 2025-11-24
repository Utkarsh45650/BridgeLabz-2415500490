package maps.scenarios;
import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("India", "New Delhi");
        map.put("USA", "Washington D.C.");
        map.put("Japan", "Tokyo");
        map.put("Germany", "Berlin");
        map.put("UK", "London");
        map.put("France", "Paris");
        map.put("Italy", "Rome");
        map.put("Russia", "Moscow");

        String country = "Japan";
        System.out.println(country + " -> " + map.getOrDefault(country, "Unknown Country"));

        for (var e : map.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());
    }
}
