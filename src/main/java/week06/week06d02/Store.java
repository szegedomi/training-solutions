package week06.week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductByCategoryName(Category category){
        int result = 0;
        for(Product product : (this.products)){
            if(product.getCategory().equals(category)){
                result++;
            }
        }
        return result;
    }

}
