package myGame.domain.item;

public class Potato implements Item {
    private String name = ItemType.POTATO.getName();
    private String effect = "gain 5HP";
    private int quantity = 5;
    private int hpBonus = 5;
    private int defBonus = 0;
    private int dmgBonus = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHpBonus() {
        return hpBonus;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String getEffect() {
        return effect;
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
