package myGame.service;

import myGame.domain.item.Item;
import myGame.domain.item.ItemType;
import myGame.factory.ItemFactory;

public class UseItemService {
     public static void listItems(){
         System.out.println("1 for HP potion");
         System.out.println("2 for potato");
     }

    public static void useItem(Player player, int num) {
        Item hpit = ItemFactory.getItemByType(ItemType.HEALTH_POTION);
        Item pttit = ItemFactory.getItemByType(ItemType.POTATO);

        if (num == 1) {
            if (hpit.getQuantity() > 0) {
                System.out.println("You use " + hpit.getName() + " and " + hpit.getEffect());
                player.setHP(player.getHP() + hpit.getValue());
                hpit.setQuantity(hpit.getQuantity() - 1);
            } else {
                System.out.println("No potions left :(");
            }
        } else if (num == 2) {
            if (pttit.getQuantity() > 0) {
                System.out.println("You use " + pttit.getName() + " and " + pttit.getEffect());
                player.setHP(player.getHP() + pttit.getValue());
                pttit.setQuantity(pttit.getQuantity() - 1);
            }else {
                System.out.println("No potions left :(");
            }
        } else {
            System.out.println("wrong command");
        }
    }
}
