package myGame.service;

import myGame.domain.enemy.Enemy;

public class FightService {
    public void fight(Player player, Enemy enemy) {
        enemy.setHP(enemy.getHP() - player.getDMG());
        player.setHP(player.getHP() - enemy.getDMG());
    }
}
