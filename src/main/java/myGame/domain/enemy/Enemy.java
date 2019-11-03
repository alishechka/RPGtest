package myGame.domain.enemy;

import myGame.factory.ItemFactory;

public interface Enemy {
    String getName();

    int getHP();

    void setHP(int HP);

    int getDMG();

    void setDMG(int DMG);

    int getDropChance();

    Enemy getNewInstance();
}
