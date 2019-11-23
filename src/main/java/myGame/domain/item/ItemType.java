package myGame.domain.item;

public enum ItemType {

    SMALL_HEALTH_POTION("Small Health Potion"),
    POTATO("Potato"),
    KNIFE("Knife"),
    MEDIUM_HEALTH_POTION("Medium Health Potion");


    private String name;

    ItemType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
