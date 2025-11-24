package maps.basic;
import java.io.*;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) throws Exception {
        String text = "Hello world, hello Java!";
        Map<String, Integer> map = new HashMap<>();
        text = text.toLowerCase().replaceAll("[^a-z0-9 ]", " ");
        for (String w : text.split("\\s+")) {
            if (w.isEmpty()) continue;
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        System.out.println(map);
    }
}
