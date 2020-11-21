package Others.MVCPattern;

import Others.MVCPattern.Controller.OrderController;
import Others.MVCPattern.Model.Item;
import Others.MVCPattern.Model.Order;
import Others.MVCPattern.View.ItemScreen;

/**
 * @author Bishwa on 05/11/2020
 */
public class Main {
    public static void main(String[] args) {
        // initialize model, view and controller
        Order orderModel = new Order();
        OrderController orderController = new OrderController(orderModel);
        ItemScreen itemScreen = new ItemScreen(orderController);
        orderModel.registerObserver(itemScreen);

        // add item interacting with view
        itemScreen.addItem(new Item("TV", 60000d));
        itemScreen.addItem(new Item("Freeze", 40000d));


    }
}
