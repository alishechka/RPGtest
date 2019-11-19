package myGame.domain.item;

public class Potato implements Item {
    private String name = ItemType.POTATO.getName();
    private String effect = "gain 5HP";
    private int quantity = 5;
    private int value = 5;

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
