package introconstructor;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<String> menu = new ArrayList<>();
    private String name;
    private int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = 4 * numberOfTables;
        addMenuToList("Rantott hus");
        addMenuToList("Gulyas leves");
        addMenuToList("Palacsinta");
    }

    public void addMenuToList(String menu){
        this.menu.add(menu);
    }

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Loyolacafe",12);

        System.out.println(restaurant.name);
        System.out.println(restaurant.capacity);
        System.out.println(restaurant.menu.toString());

    }


}
