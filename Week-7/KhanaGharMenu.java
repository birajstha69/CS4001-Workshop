class MenuItem {
    String itemName;
    double price;
    String category;
    boolean isVegetarian;
    boolean isAvailable;
    MenuItem(String itemName, double price, String category, boolean isVegetarian, boolean isAvailable) {       // Constructor
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.isVegetarian = isVegetarian;
        this.isAvailable = isAvailable;
    }
    void display() {                                                      // Display method
        System.out.println(itemName + "         Rs." + price +"\t" + category +"\t" + (isVegetarian ? "Veg" : "Non-Veg") +
            "\t" + (isAvailable ? "Available" : "Not Available") );
    }
}
public class KhanaGharMenu {
    public static void main(String[] args) {                         // Creating menu items
        MenuItem[] menu = {
            new MenuItem("Dal-Bhat Set", 120, "Dal-Bhat", true, true),
            new MenuItem("Masala Chiya", 15, "Chiya-Nasta", true, true),
            new MenuItem("Dharane Kalo Bangur", 400, "Special", false, true),
            new MenuItem("Sekuwa", 200, "BBQ", false, false)
        };
        System.out.println("\n====== KHANA GHAR MENU ======");
        System.out.println("Item\t\t\tPrice\tCategory\tType\tStatus");
        System.out.println("-------------------------------------------------");
        for (MenuItem item : menu) {
            item.display();
        }
        // Vegetarian items
        System.out.println("\n--- Vegetarian Items ---");
        for (MenuItem item : menu) {
            if (item.isVegetarian) {
                item.display();
            }
        }
        // Non-Vegetarian items
        System.out.println("\n--- Non-Vegetarian Items ---");
        for (MenuItem item : menu) {
            if (!item.isVegetarian) {
                item.display();
            }
        }
        // Non-veg items with price > 100 and available
        System.out.println("\n--- Non-Veg Items (Price > Rs.100 & Available) ---");
        for (MenuItem item : menu) {
            if (!item.isVegetarian && item.price > 100 && item.isAvailable) {
                item.display();
            }
        }
    }
}