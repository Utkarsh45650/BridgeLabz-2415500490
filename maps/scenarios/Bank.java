package maps.scenarios;
import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Map<String, Double> bank = new HashMap<>();

        bank.put("AC1", 20000.0);
        bank.put("AC2", 55000.0);
        bank.put("AC3", 11000.0);
        bank.put("AC4", 80000.0);

        // deposit to AC1
        bank.put("AC1", bank.get("AC1") + 5000);

        // withdraw from AC3
        double withdraw = 7000;
        if (bank.get("AC3") >= withdraw)
            bank.put("AC3", bank.get("AC3") - withdraw);
        else
            System.out.println("Insufficient balance for AC3!");

        List<Map.Entry<String, Double>> list = new ArrayList<>(bank.entrySet());
        list.sort((a,b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("Customers sorted by balance (desc):");
        for (var e : list) System.out.println(e.getKey() + " -> " + e.getValue());

        System.out.println("Top 3 customers:");
        for (int i=0; i<3 && i<list.size(); i++) System.out.println(list.get(i));
    }
}
