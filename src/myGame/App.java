package myGame;

import java.util.*;

public class App {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Items items = new Items();
        Player player = new Player();
        Enemy enemy = new Enemy();

        boolean game = true;

        while (game) {
            System.out.println("Hello traveller");
            System.out.println("tell us your name");
            String name = sc.nextLine();
            System.out.println("your name is " + name);
            System.out.println("you have wood: " + items.getWood() + " steel: " + items.getSteel() + " tools: " + items.getTools());
            while (player.getHP() > 0 && enemy.getHP() > 0) {
                System.out.println("monster has health of " + enemy.getHP());
                System.out.println("your HP is " + player.getHP());
                System.out.println("ATTACK");
                System.out.println("1 for attack");
                System.out.println("2 for potion heal");
                int input = sc.nextInt();
                if (input == 1) {
                    fight(player, enemy);

                } else if (input == 2) {
                    if (items.getHealthPotion() > 0) {
                        System.out.println("heal for 30HP");
                        player.setHP(player.getHP() + 30);
                        items.setHealthPotion(items.getHealthPotion() - 1);
                    }

                } else {
                    System.out.println("wrong command");
                }
            }

            game = false;
        }
    }


    static void fight(Player player, Enemy enemy) {
        enemy.setHP(enemy.getHP() - player.getDMG());
        player.setHP(player.getHP() - enemy.getDMG());
        System.out.println("monster has hp of " + enemy.getHP());
        System.out.println("your HP is " + player.getHP());
    }

    static void loot(Items items) {
        items.setHealthPotion(items.getHealthPotion() + 1);
        items.setSteel(items.getSteel() + 5);
        items.setWood(items.getWood() + 10);
        items.setTools(items.getTools() + 1);
    }


}
