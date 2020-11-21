package algorithmscount;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int level){
        int result = 0;
        for(BankAccount bankAccount : bankAccounts){
            if(bankAccount.getBalance() > level){
                result++;
            }
        }
        return result;
    }

}
