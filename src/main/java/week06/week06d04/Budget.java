package week06.week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<Item> items = new ArrayList<>();

    public Budget(List<Item> items) {
        this.items = items;
    }

    public void addItemToBudget(Item item){
        this.items.add(item);
    }

    public List<Item> getItems() {
        List<Item> result = new ArrayList<>(this.items);
        return result;
    }

    public List<Item> getItemsByMonth(int month) {
        List<Item> result = new ArrayList<>();
        for (Item item : this.items) {
            if (month == item.getMonth()){
                result.add(item);
            }
        }
        return result;
    }

}
