package maps.scenarios;
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 40000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1500.0);

        // simulate remove Mouse
        cart.remove("Mouse");

        double total = 0;
        for (double p : cart.values()) total += p;

        if (total > 5000) total *= 0.90; // 10% discount

        System.out.println("Total = " + total);
        System.out.println("Items in cart (in insertion order):");
        cart.forEach((k,v)-> System.out.println(k + " -> " + v));
    }
}
