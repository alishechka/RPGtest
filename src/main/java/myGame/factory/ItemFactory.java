package myGame.factory;

import myGame.domain.item.HealthPotion;
import myGame.domain.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemFactory {
    private List<Item> itemList = new ArrayList<>();

    public ItemFactory() {
        itemList.add(new HealthPotion());

    }

    public void getInventory() {
        for (Item item : itemList) {
            System.out.println("You have: \n" + item.getItem()+" " +item.getName()+"\n");
        }

    }

}
