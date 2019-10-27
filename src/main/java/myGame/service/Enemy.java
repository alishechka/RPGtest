package myGame.service;

public class Enemy {
    private int HP=50;
    private int DMG=5;

    public Enemy() {
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDMG() {
        return DMG;
    }

    public void setDMG(int DMG) {
        this.DMG = DMG;
    }
}
