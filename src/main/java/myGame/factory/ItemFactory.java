package myGame.factory;

import myGame.domain.item.*;

import java.util.*;

public class ItemFactory {

    private static Map<ItemType, Item> itemMap = new HashMap<>();
    static {
        itemMap.put(ItemType.SMALL_HEALTH_POTION, new SmallHealthPotion());
        itemMap.put(ItemType.POTATO, new Potato());
        itemMap.put(ItemType.KNIFE, new Knife());
        itemMap.put(ItemType.MEDIUM_HEALTH_POTION, new MediumHealthPotion());
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
    public static Map<ItemType, Item> getItemMap() {
        return itemMap;
    }
}
