package algorithmssum;

import java.util.ArrayList;
import java.util.List;

public class SalesAmountSumCalculator {

    private List<Salesperson> salespeople = new ArrayList<>();

    public void addSalesperson(Salesperson salesperson){
        salespeople.add(salesperson);
    }

    public int sumSalesAmount(List<Salesperson> salespeople){
        int result = 0;
        for (Salesperson salesperson : salespeople){
            result += salesperson.getAmount();
        }
        return result;
    }

}
