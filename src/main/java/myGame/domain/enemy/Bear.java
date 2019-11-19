package myGame.domain.enemy;

public class Bear implements Enemy {
    private int HP = 100;
    private int DMG = 10;
    private int dropChance = 70;

    @Override
    public int getDropChance() {
        return dropChance;
    }

    @Override
    public String getName() {
        return "Bear";
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
        return new Bear();
    }
}
