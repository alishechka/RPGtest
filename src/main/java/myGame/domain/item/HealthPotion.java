package myGame.domain.item;

public class HealthPotion implements Item {
    private String name = "Health Potion";
    private String effect = "gain 25HP";
    private int quantity = 1;
    private int value = 25;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getValue() {
        return value;
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
}
