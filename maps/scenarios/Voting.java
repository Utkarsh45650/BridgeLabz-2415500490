package maps.scenarios;
import java.util.*;

public class Voting {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] casted = {"Alice","Bob","Alice","Carol","Alice","Bob","Carol","Carol","Alice","Bob"};

        for (String v : casted) {
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        }

        String winner = null;
        int max = -1;

        for (var e : votes.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                winner = e.getKey();
            }
        }

        System.out.println("Votes: " + votes);
        System.out.println("Winner: " + winner);
    }
}
