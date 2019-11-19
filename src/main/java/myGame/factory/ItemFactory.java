package myGame.factory;

import myGame.domain.item.HealthPotion;
import myGame.domain.item.Potato;
import myGame.domain.item.Item;
import myGame.domain.item.ItemType;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {

    private static Map<ItemType, Item> itemMap = new HashMap<>();

    static {
        itemMap.put(ItemType.HEALTH_POTION, new HealthPotion());
        itemMap.put(ItemType.POTATO, new Potato());
    }

    public static void getInventory() {
        for (Map.Entry<ItemType, Item> item : itemMap.entrySet()) {
            if (getItemByType(item.getKey()).getQuantity() > 0) {
                System.out.println(item.getKey().getName() + " " + getItemByType(item.getKey()).getQuantity());
            }
        }
    }

    public static Item getItemByType(ItemType itemType) {
        return itemMap.get(itemType);
    }
}
