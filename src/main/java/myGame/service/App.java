package myGame.service;

import java.util.*;

import myGame.domain.enemy.Enemy;
import myGame.factory.EnemyFactory;
import myGame.factory.ItemFactory;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LootService lootService = new LootService();
        FightService fightService = new FightService(lootService);
        Player player = new Player();
        Enemy enemy = EnemyFactory.getRandomEnemy();

        boolean game = true;

        System.out.println("Hello traveller");
        System.out.println("tell us your name");
        String name = sc.nextLine();
        System.out.println("your name is " + name);

        while (game) {
            fightService.assertIfEnemyIsDefeated(enemy);

            if (enemy.getHP() < 1) {
                enemy = EnemyFactory.getRandomEnemy();
            }

            while (enemy.getHP() > 0) {
                System.out.println(enemy.getName() + " has appeared");
                System.out.println("monster has health of " + enemy.getHP());
                System.out.println("your HP is " + player.getHP());
                System.out.println("ATTACK");
                System.out.println("1 for attack");
                System.out.println("2 for item use");
                System.out.println("3 for item check");
                int input = sc.nextInt();
                if (input == 1) {
                    fightService.fight(player, enemy);
                } else if (input == 2) {
                    UseItemService.listItems();
                    int inputItem = sc.nextInt();
                    UseItemService.useItem(player,inputItem);
                } else if (input == 3) {
                    ItemFactory.getInventory();
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
