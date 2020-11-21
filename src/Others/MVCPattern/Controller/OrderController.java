package Others.MVCPattern.Controller;

import Others.MVCPattern.Model.Item;
import Others.MVCPattern.Model.Order;

/**
 * @author Bishwa on 05/11/2020
 */
public class OrderController {
    private Order order;

    public OrderController(Order order) {
        this.order = order;
    }

    public void addItem(Item item) {
        order.addItem(item);
    }

    public void removeItem(Item item) {
        order.removeItem(item);
    }
}
