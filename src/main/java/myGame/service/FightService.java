package myGame.service;

import myGame.domain.enemy.Enemy;

public class FightService {

    private LootService lootService;

    public FightService(LootService lootService) {
        this.lootService = lootService;
    }

    public void fight(Player player, Enemy enemy) {
        enemy.setHP(enemy.getHP() - player.getDMG());
        player.setHP(player.getHP() - enemy.getDMG());
    }

    public void assertIfEnemyIsDefeated(Enemy enemy) {
        if (enemy.getHP() < 1) {
            System.out.println("YOU HAVE DEFEATED " + enemy.getName());
            lootService.lootDrop(enemy);
        }
    }
}
