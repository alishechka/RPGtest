package myGame.domain.item;

public class SmallHealthPotion implements Item {
    private String name = ItemType.SMALL_HEALTH_POTION.getName();
    private String effect = "gain 25HP";
    private int quantity = 1;
    private int hpBonus = 25;
    private int defBonus = 0;
    private int dmgBonus = 0;
    private int itemLevel=2;

    @Override
    public int getItemLevel(){
        return itemLevel;
    }

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
