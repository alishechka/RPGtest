package myGame.domain.item;

public interface Item {
    String name = "";
    String effect = "";
    int quantity = 0;
    int hpBonus = 0;
    int defBonus = 0;
    int dmgBonus = 0;
    int itemLevel=0;


    String getName();
    int getQuantity();
    void setQuantity(int quantity);
    String getEffect();
    int getHpBonus();
    int getDefBonus();
    int getDmgBonus();
    int getItemLevel();
}
