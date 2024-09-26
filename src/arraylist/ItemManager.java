package arraylist;

//hello IT20
import java.util.ArrayList;

public class ItemManager {
	private ArrayList<String> items;


    public ItemManager() {
        items = new ArrayList<>();
    }


    public void addItem(String item) {
        items.add(item);
        System.out.println("Item added: " + item);
    }


    public void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println("Item removed: " + item);
        } else {
            System.out.println("Item not found: " + item);
        }
    }


    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("No items to display.");
        } else {
            System.out.println("Items in the list:");
            for (String item : items) {
                System.out.println(item);
            }
        }
    }
}
