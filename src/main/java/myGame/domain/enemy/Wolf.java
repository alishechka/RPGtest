package myGame.domain.enemy;


public class Wolf implements Enemy {

    private int HP = 50;
    private int DMG = 5;
    private int dropChance = 30;
    int enemyLevel = 2;

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

}
