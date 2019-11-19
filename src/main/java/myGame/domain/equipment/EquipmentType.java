package myGame.domain.equipment;

public enum EquipmentType {
    SWORD("Sword"),
    SHIELD("Shield"),
    ARMOUR("Armour");

    private String name;

    EquipmentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
