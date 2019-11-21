package myGame.domain.item;

public class Knife implements Item{
    private String name = ItemType.KNIFE.getName();
    private String effect = "stab stab stab";
    private int quantity = 1;
    private int hpBonus = 0;
    private int defBonus = 1;
    private int dmgBonus = 5;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }

    @Override
    public String getEffect() {
        return effect;
    }

    @Override
    public int getHpBonus() {
        return hpBonus;
    }

    @Override
    public int getDefBonus() {
        return defBonus;
    }

    @Override
    public int getDmgBonus() {
        return dmgBonus;
    }
}
