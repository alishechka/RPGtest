package myGame.domain.enemy;

import myGame.factory.ItemFactory;

public interface Enemy {
    int HP = 0;
    int DMG = 0;
    int dropChance = 0;
    int enemyLevel = 0;


    String getName();
    int getHP();
    void setHP(int HP);
    int getDMG();
    void setDMG(int DMG);
    int getDropChance();
    int getEnemyLevel();
    Enemy getNewInstance();
}
