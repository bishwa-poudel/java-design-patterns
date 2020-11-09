package Structural.ProxyPattern;

import java.util.ArrayList;

/**
 * @author Bishwa on 15/10/2020
 */
public class Order {
    private ArrayList<Item> itemList = new ArrayList<>();

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
}
