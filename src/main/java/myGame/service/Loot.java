package myGame.service;

import myGame.domain.enemy.Enemy;
import myGame.domain.item.Item;
import myGame.factory.ItemFactory;

import java.util.Random;

public class Loot {
    public void lootDrop(Enemy enemy, ItemFactory itemFactory) {
        Item hpit = itemFactory.itemPOJO("Health Potion");
        Random rand = new Random();
        int i = rand.nextInt(100);
        int ii = enemy.getDropChance();
        if (i <= ii) {
            System.out.println("got loot of " + hpit.getName());

            hpit.setQuantity(hpit.getQuantity() + 1);
        } else {
            System.out.println("drop nothing");
        }

    }
}
