package myGame.domain.enemy;


public class Rat implements Enemy {

    private int HP = 20;
    private int DMG = 2;
    private int dropChance = 10;
    int enemyLevel = 1;

    @Override
    public int getEnemyLevel() {
        return enemyLevel;
    }

    @Override
    public int getDropChance() {
        return dropChance;
    }

    @Override
    public String getName() {
        return "Ratatat";
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
        return new Rat();
    }


}
