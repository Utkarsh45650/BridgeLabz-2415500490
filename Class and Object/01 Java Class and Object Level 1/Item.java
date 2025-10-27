public class Item {
    String itemCode;
    String itemName;
    double price;
    
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    
    public void displayDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost(quantity));
    }
    
    public double totalCost(int quantity) {
        return price * quantity;
    }
    
    public static void main(String[] args) {
        Item item = new Item("A123", "Notebook", 50);
        item.displayDetails(3);
    }
}
