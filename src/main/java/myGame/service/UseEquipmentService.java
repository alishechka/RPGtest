package myGame.service;

import myGame.domain.item.Item;
import myGame.domain.item.ItemType;
import myGame.factory.ItemFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static myGame.factory.ItemFactory.getItemByType;

public class UseEquipmentService {

    public static void equipTest(Player player) {
        List<Item> itemList = new ArrayList<>();
        int counter = 0;
        System.out.println("choose item to use: ");
        for (Map.Entry<ItemType, Item> item : ItemFactory.getItemMap().entrySet()) {
            if (getItemByType(item.getKey()).getQuantity() > 0) {
                itemList.add(getItemByType((item.getKey())));
                counter += 1;
                System.out.println(counter + " " + item.getKey().getName() + " " + getItemByType(item.getKey()).getQuantity());
            }

        }
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        chooseItem(input, itemList, player);

    }

    public static void chooseItem(int num, List<Item> itemList, Player player) {
        num -= 1;
        System.out.println("you've equipped " + itemList.get(num).getName());
        player.setHP(player.getHP() + itemList.get(num).getHpBonus());
        player.setDMG(player.getDMG() + itemList.get(num).getDmgBonus());
        player.setDEF(player.getDEF() + itemList.get(num).getDefBonus());
        itemList.get(num).setQuantity(itemList.get(num).getQuantity() - 1);
        System.out.println("new stats are as follows:");
        player.getStatus();
    }
}
