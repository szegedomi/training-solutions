package algorithmssum;

import java.util.ArrayList;
import java.util.List;

public class TransactionSumCalculator {

    private List<Transaction> transactions = new ArrayList<>();

    public int sumAmountOfCreditEntries(List<Transaction> transactions){
        int result = 0;
        for (Transaction transaction : transactions){
            if(transaction.getTo().equals(TransactionOperation.CREDIT)){
                result += transaction.getAmount();
            }
        }
        return result;
    }

}
