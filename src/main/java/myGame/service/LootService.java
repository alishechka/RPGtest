package myGame.service;

import myGame.domain.enemy.Enemy;
import myGame.domain.item.Item;
import myGame.domain.item.ItemType;
import myGame.factory.ItemFactory;

import java.util.Random;

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


}
