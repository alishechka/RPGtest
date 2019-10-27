package myGame.factory;

import myGame.domain.enemy.Enemy;
import myGame.domain.enemy.Rat;
import myGame.domain.enemy.Wolf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnemyFactory {
    private List<Enemy> enemies = new ArrayList<>();

    public EnemyFactory() {
        enemies.add(new Rat());
        enemies.add(new Wolf());
    }

    public Enemy getRandomEnemy() {
        int i = new Random().nextInt(enemies.size());
        Enemy enemy = enemies.get(i);
        return enemy.getNewInstance();

    }
}
