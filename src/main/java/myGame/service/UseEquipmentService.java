package myGame.service;

import myGame.domain.item.Item;
import myGame.domain.item.ItemType;
import myGame.factory.ItemFactory;

public class UseEquipmentService {

    public static void equipEquipment(Player player) {
        Item equipment = ItemFactory.getItemByType(ItemType.KNIFE);

        System.out.println("you've equipped " + equipment.getName());
        player.setHP(player.getHP() + equipment.getHpBonus());
        player.setDMG(player.getDMG() + equipment.getDmgBonus());
        player.setDEF(player.getDEF() + equipment.getDefBonus());
        equipment.setQuantity(equipment.getQuantity()-1);
        System.out.println("new stats are as follows:");
        player.getStatus();

    }
}
