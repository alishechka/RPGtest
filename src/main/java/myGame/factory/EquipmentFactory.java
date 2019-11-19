package myGame.factory;

import myGame.domain.equipment.Equipment;
import myGame.domain.equipment.EquipmentType;
import myGame.domain.equipment.Sword;

import java.util.HashMap;
import java.util.Map;

public class EquipmentFactory {
    private static Map<EquipmentType, Equipment> equipmentMap = new HashMap<>();

    static {
        equipmentMap.put(EquipmentType.SWORD, new Sword());
    }

    public static void getInventory() {
        for (Map.Entry<EquipmentType, Equipment> item : equipmentMap.entrySet()) {
            if (getEquipmentByType(item.getKey()).getQuantity() > 0) {
                System.out.println(item.getKey().getName() + " " + getEquipmentByType(item.getKey()).getQuantity());
            }
        }
    }

    public static Equipment getEquipmentByType(EquipmentType equpType) {
        return equipmentMap.get(equpType);
    }
}
