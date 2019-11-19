package myGame.service;

import myGame.domain.equipment.Equipment;
import myGame.domain.equipment.EquipmentType;
import myGame.factory.EquipmentFactory;

public class UseEquipmentService {

    public static void equipEquipment(Player player){
        Equipment equipment = EquipmentFactory.getEquipmentByType(EquipmentType.SWORD);

        System.out.println("you've equipped "+equipment.getName());
        player.setHP(player.getHP()+equipment.getHpBonus());
        player.setDMG(player.getDMG()+equipment.getDmgBonus());
        player.setDEF(player.getDEF()+equipment.getDefBonus());
        System.out.println("new stats are as follows:");
        player.getStatus();

    }
}
