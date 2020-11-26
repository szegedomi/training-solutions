package week05.week05d04;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    public void StoreTesting(){

        Store store = new Store(new ArrayList<Product>());
        store.addProduct(new Product("kenyér", 2020, 11,25));
        store.addProduct(new Product("tej", 2020, 11,27));

        assertEquals(2, store.getProducts().size());
        assertEquals(1 , store.getNumberOfExpired());

    }

}