package Structural.ProxyPattern.Proxy;

import Structural.ProxyPattern.IOrder;
import Structural.ProxyPattern.Order;
import Structural.ProxyPattern.Subject.Warehouse;

import java.util.List;

/**
 * @author Bishwa on 15/10/2020
 */
public class OrderFullfillment implements IOrder {
    private List<Warehouse> warehouses;

    // Constructors and other attributes will go here


    @Override
    public void fulfillOrder(Order order) {
        /*
        For each item in order, check each warehouse to see if it is in stock.
        If it is create new order for that warehouse, else check next warehouse

        Send all the orders to warehouses after you finish iterating over all items in the original Order.

         */
    }
}
