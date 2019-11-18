package myGame.factory;

import myGame.domain.item.HealthPotion;
import myGame.domain.item.Item;
import myGame.domain.item.ItemType;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {

    private static Map<ItemType, Item> itemMap = new HashMap<>();
    static {
        itemMap.put(ItemType.HEALTH_POTION, new HealthPotion());
    }

    public static void getInventory() {
        for (Map.Entry<ItemType, Item> item : itemMap.entrySet()) {
            System.out.println("You have: \n" + item.getKey().getName() + " " + getItemByType(item.getKey()).getQuantity() + "\n");
        }
    }

    public static Item getItemByType(ItemType itemType) {
        return itemMap.get(itemType);
    }
}
