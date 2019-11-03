package myGame.domain.enemy;

import myGame.factory.ItemFactory;

public class Wolf implements Enemy {

    private int HP = 50;
    private int DMG = 5;

    @Override
    public String getName() {
        return "Wolf";
    }

    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public int getDMG() {
        return DMG;
    }

    @Override
    public void setDMG(int DMG) {
        this.DMG = DMG;
    }

    @Override
    public Enemy getNewInstance() {
        return new Wolf();
    }

    @Override
    public int lootDrop(ItemFactory itemFactory) {
        String healthPotion = "Health Potion";
        itemFactory.setItemQuantity(healthPotion, itemFactory.getItemQuantity(healthPotion) + 1);
        return 0;
    }
}
