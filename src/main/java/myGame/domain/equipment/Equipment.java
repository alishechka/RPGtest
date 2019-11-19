package myGame.domain.equipment;

public interface Equipment {
    String getName();
    int getHpBonus();
    int getDefBonus();
    int getDmgBonus();
    int getQuantity();
    void setQuantity(int quantity);
}
