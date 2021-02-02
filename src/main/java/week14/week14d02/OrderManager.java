package week14.week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class OrderManager {

    private Map<String, List<String>> orders = new HashMap<>();

    public Map<String, List<String>> getOrders() {
        return orders;
    }

    public void fillOrderFromFile(Path file){
        try(BufferedReader reader = Files.newBufferedReader(file)){
            String line;
            String id;
            List<String> items;
            while((line=reader.readLine()) != null){
                id = line.split(" ")[0];
                items = Arrays.asList(line.split(" ")[1].split(","));
                Collections.sort(items);
                this.orders.put(id, items);
            }
        }
        catch(IOException ioe ){
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    public List<String> getOrderByID(String id){
        return this.orders.get(id);
    }

    public Map<String, Integer> orderStat(){
        Map<String, Integer> result = new HashMap<>();
        for(List<String> order : orders.values()){
            for(String str : order){
                if(!result.containsKey(str)){
                    result.put(str, 1);
                }
                else{
                    result.put(str, result.get(str)+1);
                }
            }
        }
        return result;
    }

    public int numberOfSoldProduct(String product){
        return orderStat().get(product);
    }

    public int numberOfProductsInOrder(String id){
        return this.orders.get(id).size();
    }

    public static void main(String[] args) {

        OrderManager om = new OrderManager();
        om.fillOrderFromFile(Path.of("src/main/resources/orders.txt"));

        System.out.println(om.getOrders());

    }

}
