package myGame.service;

import java.util.*;

import myGame.domain.enemy.Enemy;
import myGame.domain.equipment.Equipment;
import myGame.domain.equipment.EquipmentType;
import myGame.factory.EnemyFactory;
import myGame.factory.EquipmentFactory;
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
                System.out.println("4 for equip sword");
                System.out.println("5 for Status");
                int input = sc.nextInt();
                if (input == 1) {
                    fightService.fight(player, enemy);
                } else if (input == 2) {
                    UseItemService.listItems();
                    int inputItem = sc.nextInt();
                    UseItemService.useItem(player, inputItem);
                } else if (input == 3) {
                    System.out.println("You have:");
                    ItemFactory.getInventory();
                    EquipmentFactory.getInventory();
                    System.out.println("\n");
                } else if (input == 4) {
                    UseEquipmentService.equipEquipment(player);

                } else if (input == 5) {
                    player.getStatus();
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
