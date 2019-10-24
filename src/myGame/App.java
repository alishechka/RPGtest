package myGame;

import java.util.*;

public class App {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        items it = new items();
        Player player = new Player();
        Enemy enemy = new Enemy();

        boolean game = true;

        while (game) {
            System.out.println("Hello traveller");
            System.out.println("tell us your name");
            String name = sc.nextLine();
            System.out.println("your name is " + name);
            System.out.println("you have wood: " + it.getWood() + " steel: " + it.getSteel() + " tools: " + it.getTools());
            while (player.getHP() > 0 || enemy.getHP() > 0) {
                System.out.println("monster has health of " + enemy.getHP());
                System.out.println("your HP is " + player.getHP());
                System.out.println("ATTACK");
                System.out.println("1 for attack");
                int input =sc.nextInt();
                if (input==1){
                   enemy.setHP(enemy.getHP() - player.getDMG());
                    System.out.println("monster has hp of "+enemy.getHP());
                }else{
                    System.out.println("wrong command");
                }

            }


            game = false;
        }


    }
}
