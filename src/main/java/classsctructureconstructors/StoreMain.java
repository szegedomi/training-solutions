package classsctructureconstructors;

public class StoreMain {

    public static void main(String[] args) {

        Store store = new Store("apple");
        System.out.println("available " + store.getStock() + " " + store.getProduct());

        store.store(25);

        System.out.println("available " + store.getStock() + " " + store.getProduct());

        store.dispatch(13);

        System.out.println("available " + store.getStock() + " " + store.getProduct());


    }

}
