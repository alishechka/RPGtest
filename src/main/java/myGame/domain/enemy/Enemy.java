package myGame.domain.enemy;

public interface Enemy {
    String getName();

    int getHP();

    void setHP(int HP);

    int getDMG();

    void setDMG(int DMG);

    Enemy getNewInstance();
}
