package myGame.service;

import java.util.*;

import myGame.domain.enemy.Enemy;

import myGame.factory.EnemyFactory;
import myGame.factory.ItemFactory;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FightService fightService = new FightService();
        Player player = new Player();
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy enemy = enemyFactory.getRandomEnemy();
        ItemFactory itemFactory = new ItemFactory();

        String healthPotion = "Health Potion";

        boolean game = true;

        System.out.println("Hello traveller");
        System.out.println("tell us your name");
        String name = sc.nextLine();
        System.out.println("your name is " + name);

        while (game) {
            if (enemy.getHP() < 1) {
                System.out.println("YOU HAVE DEFEATED " + enemy.getName());
                enemy = enemyFactory.getRandomEnemy();
            }
            while (enemy.getHP() > 0) {
                System.out.println(enemy.getName() + " has appeared");
                System.out.println("monster has health of " + enemy.getHP());
                System.out.println("your HP is " + player.getHP());
                System.out.println("ATTACK");
                System.out.println("1 for attack");
                System.out.println("2 for potion heal");
                System.out.println("3 for item check");
                int input = sc.nextInt();
                if (input == 1) {
                    fightService.fight(player, enemy, itemFactory);
                } else if (input == 2) {
                    if (itemFactory.getItemQuantity(healthPotion) > 0) {
                        System.out.println("You drink " + itemFactory.getItemName(healthPotion) + " and " + itemFactory.getItemEffect(healthPotion));
                        player.setHP(player.getHP() + itemFactory.getItemValue(healthPotion));
                        itemFactory.setItemQuantity(healthPotion, itemFactory.getItemQuantity(healthPotion) - 1);
                    } else {
                        System.out.println("No potions left :(");
                    }
                } else if (input == 3) {
                    itemFactory.getInventory();
                } else {
                    System.out.println("wrong command");
                }
                if (player.getHP() < 1) {
                    System.out.println(name + " has perished");
                    System.out.println("***GAME OVER***");
                    game = false;
                }
            }
        }
    }
}
