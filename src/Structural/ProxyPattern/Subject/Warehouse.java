package Structural.ProxyPattern.Subject;

import Structural.ProxyPattern.IOrder;
import Structural.ProxyPattern.Item;
import Structural.ProxyPattern.Order;

import java.util.Hashtable;

/**
 * @author Bishwa on 15/10/2020
 */
public class Warehouse implements IOrder {
    private Hashtable<String, Integer> stock;
    private String address;

    // Constructors and other attributes will go here

    @Override
    public void fulfillOrder(Order order) {
        for (Item item : order.getItemList()) {
            this.stock.replace(item.getSku(), stock.get(item.getSku()) - 1);
        }

        // process order for shipment and delivery
    }

    public int currentInventory(Item item) {
        if(stock.containsKey(item.getSku())) {
            return stock.get(item.getSku());
        }

        return 0;
    }
}
