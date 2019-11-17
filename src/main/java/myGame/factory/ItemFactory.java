package myGame.factory;

import myGame.domain.item.HealthPotion;
import myGame.domain.item.Item;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
    private Map<String, Item> itemMap = new HashMap<>();

    public ItemFactory() {
        itemMap.put("Health Potion", new HealthPotion());
    }
    public void getInventory() {
        for (Map.Entry<String, Item> item : itemMap.entrySet()) {
            System.out.println("You have: \n" + item.getKey() + " " + itemPOJO(item.getKey()).getQuantity() + "\n");
        }
    }
    public Item itemPOJO(String str) {
        return itemMap.get(str);
    }
}
