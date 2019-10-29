package myGame.domain.item;

public class HealthPotion implements Item {
    private String name="Health Potion";
    private int item =1;
    private String effect="gain 25HP";
    private int value=25;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public int getItem() {
        return item;
    }

    @Override
    public void setItem(int item) {
        this.item=item;
    }

    @Override
    public String getEffect() {
        return effect;
    }
}
