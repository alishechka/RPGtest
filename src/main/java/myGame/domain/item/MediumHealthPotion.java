package myGame.domain.item;

public class MediumHealthPotion implements Item{
    private String name = ItemType.MEDIUM_HEALTH_POTION.getName();
    private String effect = "gain 50HP";
    private int quantity = 0;
    private int hpBonus = 50;
    private int defBonus = 0;
    private int dmgBonus = 0;
    private int itemLevel=3;

    @Override
    public int getItemLevel() {
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
