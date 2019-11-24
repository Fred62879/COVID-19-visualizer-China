package model;

import java.util.HashMap;
import java.util.Map;

public class SameNameHashMap {
    private Map<Item, ItemList> itemMap;

    public SameNameHashMap() {
        itemMap = new HashMap<Item, ItemList>();
    }

    public void addItem(Item newItem) {
        if (!itemMap.containsKey(newItem)) {
            ItemList newItemList = new ItemList();
            newItemList.getItemList().add(newItem);
            itemMap.put(newItem, newItemList);
        } else {
            ItemList tempoList = itemMap.get(newItem);
            tempoList.getItemList().add(newItem);
        }
    }

    public ItemList getList(Item i) {
        return itemMap.get(i);
    }

}
