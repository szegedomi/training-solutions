package week06.week06d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    public void StoreTester(){
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("kenyer", Category.BAKEDGOODS, 220));
        productList.add(new Product("zsomle", Category.BAKEDGOODS, 22));
        productList.add(new Product("ceruza", Category.OTHER, 150));

        Store store = new Store(productList);

        assertEquals(store.getProductByCategoryName(Category.BAKEDGOODS),2);


    }


}