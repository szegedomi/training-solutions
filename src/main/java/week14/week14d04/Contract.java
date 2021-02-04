package week14.week14d04;

import java.util.ArrayList;
import java.util.List;

public class Contract {

    private String client;
    private List<Integer> monthlyPrices = new ArrayList<>();

    public Contract(String client, List<Integer> monthlyPrices) {
        this.client = client;
        this.monthlyPrices = monthlyPrices;
    }

    public String getClient() {
        return client;
    }

    public List<Integer> getMonthlyPrices() {
        return monthlyPrices;
    }
}
