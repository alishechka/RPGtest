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
            System.out.println("You have: \n" + item.getKey() + " " + getItemQuantity(item.getKey()) + "\n");
        }
    }
    public int getItemQuantity(String str) {
        Item item = itemMap.get(str);
        return item.getQuantity();
    }
    public String getItemName(String str) {
        Item item = itemMap.get(str);
        return item.getName();
    }
    public void setItemQuantity(String str, int quantity) {
        Item item = itemMap.get(str);
        item.setQuantity(quantity);
    }
    public String getItemEffect(String str) {
        Item item = itemMap.get(str);
        return item.getEffect();
    }
    public int getItemValue(String str) {
        Item item = itemMap.get(str);
        return item.getValue();
    }
}
