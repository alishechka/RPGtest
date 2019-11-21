package myGame.domain.item;

public enum ItemType {

    HEALTH_POTION("Health Potion"),
    POTATO("Potato"),
    KNIFE("Knife");

    private String name;

    ItemType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
