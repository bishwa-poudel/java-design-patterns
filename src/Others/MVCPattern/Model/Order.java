package Others.MVCPattern.Model;

import Others.MVCPattern.core.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bishwa on 05/11/2020
 */
public class Order extends Subject {
    private List<Item> itemList = new ArrayList<>();

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public void addItem(Item item) {
        itemList.add(item);
        notifyObservers(itemList);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
        notifyObservers(itemList);
    }
}
