package myGame.domain.item;

public interface Item {
    String getName();
    int getQuantity();
    void setQuantity(int quantity);
    String getEffect();
    int getValue();
}
