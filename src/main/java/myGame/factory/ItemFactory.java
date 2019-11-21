package myGame.factory;

import myGame.domain.item.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemFactory {

    private static Map<ItemType, Item> itemMap = new HashMap<>();

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

    public static void useInventory() {
        List<Item> itemList=new ArrayList<>();
        int counter=0;
        for (Map.Entry<ItemType, Item> item : itemMap.entrySet()) {
            if (getItemByType(item.getKey()).getQuantity() > 0) {
                itemList.add(getItemByType((item.getKey())));
                counter+=1;
                System.out.println(counter);

            }

        }            System.out.println(itemList.get(1).getName());

    }

    public static Item getItemByType(ItemType itemType) {
        return itemMap.get(itemType);
    }
}
