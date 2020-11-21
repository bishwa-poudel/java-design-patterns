package Others.MVCPattern.View;

import Others.MVCPattern.Controller.OrderController;
import Others.MVCPattern.Model.Item;
import Others.MVCPattern.core.Observer;

import java.util.List;

/**
 * @author Bishwa on 05/11/2020
 */
public class ItemScreen implements Observer {
    private OrderController orderController;

    public ItemScreen(OrderController orderController) {
        this.orderController = orderController;
    }

    @Override
    public void update(List<Item> itemList) {
        renderItemList(itemList);
    }

    private void renderItemList(List<Item> itemList) {
        System.out.println("\n\n======= Item List =======");
        itemList.forEach(System.out::println);
        System.out.println("\n\n");
    }

    public void addItem(Item item) {
        System.out.println("Add item button clicked");
        orderController.addItem(item);
    }

    public void deleteItem(Item item) {
        System.out.println("Delete item button clicked");
        orderController.removeItem(item);
    }
}
