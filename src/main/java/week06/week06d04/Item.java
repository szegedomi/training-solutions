package week06.week06d04;

public class Item {

    private String name;
    private int price;
    private int month;

    public Item(String name, int price, int month) {
        if(name == null || "".equals(name)){
            throw new IllegalArgumentException("Name must not be null or empty!");
        }
        this.name = name;
        if(price < 0 ){
            throw new IllegalArgumentException("Price must be a non-negative integer!");
        }
        this.price = price;
        if( month > 12 || month < 1){
            throw new IllegalArgumentException("Invalid month input outside the acceptable range!");
        }
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }
}
