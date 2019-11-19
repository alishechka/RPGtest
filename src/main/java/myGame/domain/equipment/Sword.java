package myGame.domain.equipment;

import myGame.domain.item.ItemType;

public class Sword implements Equipment {
    private String name = EquipmentType.SWORD.getName();
    private int hpBonus=0;
    private int defBonus=5;
    private int dmgBonus=15;
    private int quantity=1;

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHpBonus() {
        return hpBonus;
    }

    @Override
    public int getDefBonus() {
        return defBonus;
    }

    @Override
    public int getDmgBonus() {
        return dmgBonus;
    }
}
