package attributes.bill;

public class BillMain {

    public static void main(String[] args) {

        Bill bill = new Bill();

        Item item1 = new Item("alma", 10,23);
        Item item2 = new Item("korte", 8, 31);

        bill.addItem(item1);
        bill.addItem(item2);

        System.out.println(bill.calculateTotalPrice());

    }

}
