package week05.week05d04;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {
        if (products == null){
            throw new IllegalArgumentException("Empty list is not allowed here");
        }
            this.products = products;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public int  getNumberOfExpired(){
        int result = 0;
        for(Product product : this.products){
            if(!(product == null) && product.getBestBefore().isBefore(LocalDate.now())){
                result++;
            }
        }
        return result;
    }


}
