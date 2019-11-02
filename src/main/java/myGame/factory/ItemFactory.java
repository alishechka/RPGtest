package myGame.factory;

import myGame.domain.item.HealthPotion;
import myGame.domain.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemFactory {
    private List<Item> itemList = new ArrayList<>();

    public ItemFactory() {
        itemList.add(new HealthPotion());

    }

    public void getInventory() {
        for (Item item : itemList) {
            System.out.println("You have: \n" + item.getQuantity()+" " +item.getName()+"\n");
        }

    }
    public int getHpQuantity(){
        Item item= itemList.get(0);
        return item.getQuantity();
    }
    public String getHPname(){
        Item item= itemList.get(0);
        return item.getName();
    }
    public void setHPquantity(int quantity){
        Item item= itemList.get(0);
        item.setQuantity(quantity);
    }

    public String getHpEffect(){
        Item item= itemList.get(0);
        return item.getEffect();
    }
    public int getHpValue(){
        Item item= itemList.get(0);
        return item.getValue();
    }
}
