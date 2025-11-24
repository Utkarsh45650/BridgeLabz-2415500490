package maps.scenarios;
import java.util.*;

public class Inventory {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

        stock.put("Soap", 20);
        stock.put("Oil", 10);
        stock.put("Pen", 50);

        // customer buys 5 Soaps
        stock.put("Soap", stock.getOrDefault("Soap",0) - 5);
        if (stock.get("Soap") <= 0) stock.remove("Soap");

        // new shipment of Oil +25
        stock.put("Oil", stock.getOrDefault("Oil",0) + 25);

        String p = "Pen";
        System.out.println(p + " Remaining = " + stock.getOrDefault(p, 0));

        System.out.println("Out of Stock Items:");
        for (var e : stock.entrySet()) {
            if (e.getValue() == 0) System.out.println(e.getKey());
        }
    }
}
