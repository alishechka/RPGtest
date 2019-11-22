package myGame.factory;

import myGame.domain.item.*;

import java.util.*;

public class ItemFactory {

    private static Map<ItemType, Item> itemMap = new HashMap<>();

    public static Map<ItemType, Item> getItemMap() {
        return itemMap;
    }

    static {
        itemMap.put(ItemType.HEALTH_POTION, new HealthPotion());
        itemMap.put(ItemType.POTATO, new Potato());
        itemMap.put(ItemType.KNIFE, new Knife());
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
