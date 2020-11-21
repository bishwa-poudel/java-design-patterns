package Others.MVCPattern.core;

import Others.MVCPattern.Model.Item;

import java.util.List;

/**
 * @author Bishwa on 05/11/2020
 */
public interface Observer {
    void update(List<Item> itemList);
}
