package myGame.service;

import java.util.*;

import myGame.domain.enemy.Enemy;

import myGame.domain.item.HealthPotion;
import myGame.domain.item.Item;
import myGame.factory.EnemyFactory;
import myGame.factory.ItemFactory;

public class App {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FightService fightService = new FightService();
//        Items items = new Items();
        Player player = new Player();
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy enemy = enemyFactory.getRandomEnemy();
        boolean game = true;

        //hmmm DRY failed?
//        HealthPotion healthPotion=new HealthPotion();
        ItemFactory itemFactory=new ItemFactory();

        System.out.println("Hello traveller");
        System.out.println("tell us your name");
        String name = sc.nextLine();
        System.out.println("your name is " + name);
        while (game) {

            if (enemy.getHP() < 1) {
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
                    fightService.fight(player, enemy);

                } else if (input == 2) {
                    if (healthPotion.getItem() > 0) {
                        System.out.println("You drink "+ healthPotion.getName()+" and "+healthPotion.getEffect());
                        player.setHP(player.getHP() + healthPotion.getValue());
                        healthPotion.setItem(healthPotion.getItem()-1);
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
