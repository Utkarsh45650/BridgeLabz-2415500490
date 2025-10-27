import java.util.ArrayList;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalCost() {
        return price * quantity;
    }

    public void display() {
        System.out.println(itemName + ": " + price + " × " + quantity + " = " + totalCost());
    }

    public static void main(String[] args) {
        ArrayList<CartItem> cart = new ArrayList<>();
        cart.add(new CartItem("Pen", 10, 5));
        cart.add(new CartItem("Book", 50, 2));

        double total = 0;
        for (CartItem item : cart) {
            item.display();
            total += item.totalCost();
        }
        System.out.println("Total Cost: " + total);
    }
}
