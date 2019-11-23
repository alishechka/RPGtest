package myGame.service;

import myGame.domain.enemy.Enemy;
import myGame.domain.item.Item;
import myGame.domain.item.ItemType;
import myGame.factory.ItemFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static myGame.factory.ItemFactory.getItemByType;

public class LootService {

    public void lootDrop(Enemy enemy) {
        Item item = ItemFactory.getItemByType(ItemType.SMALL_HEALTH_POTION);
        Random rand = new Random();
        int chance = rand.nextInt(100);
        int dropChance = enemy.getDropChance();
        if (chance <= dropChance) {
            System.out.println("got loot of " + item.getName());
            item.setQuantity(item.getQuantity() + 1);
        } else {
            System.out.println("drop nothing");
        }

    }

    public void lootTEST(Enemy enemy) {

        Random rand = new Random();
        int chance = rand.nextInt(100);
        int dropChance = enemy.getDropChance();
        List<Item> itemList = new ArrayList<>();
        int enemyLvl = enemy.getEnemyLevel();


        if (chance <= dropChance) {
            for (Map.Entry<ItemType, Item> item : ItemFactory.getItemMap().entrySet()) {
                int itemLvl = getItemByType(item.getKey()).getItemLevel();
                if (itemLvl <= enemyLvl) {
                    itemList.add(getItemByType(item.getKey()));
                    System.out.println(itemList.toString());

                }

            }
            int drop=rand.nextInt(itemList.size());
            System.out.println("--list size"+itemList.size());
            System.out.println(drop);
            System.out.println("got loot of " + itemList.get(drop).getName());
            itemList.get(drop).setQuantity(itemList.get(drop).getQuantity() + 1);
        } else {
            System.out.println("drop nothing");
        }
    }


}
