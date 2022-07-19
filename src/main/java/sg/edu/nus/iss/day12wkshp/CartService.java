package sg.edu.nus.iss.day12wkshp;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    
    public static List<Item> getShoppingItems() {
    
        List<Item> listItems = new ArrayList<>();

        Item itm = new Item();
        itm.setItemName("Prada bag");
        itm.setQuantity(5);
        listItems.add(itm);

        itm = new Item();
        itm.setItemName("Macbook Pro");
        itm.setQuantity(10);
        listItems.add(itm);

        itm = new Item();
        itm.setItemName("LV Tote Bag");
        itm.setQuantity(8);
        listItems.add(itm);

        itm = new Item();
        itm.setItemName("Airpods Pro");
        itm.setQuantity(10);
        listItems.add(itm);

        return listItems;
    }
}
