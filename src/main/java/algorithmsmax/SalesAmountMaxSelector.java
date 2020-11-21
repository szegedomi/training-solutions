package algorithmsmax;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespeople){
        int result=0;
        Salesperson best = null;
        for (Salesperson salesperson : salespeople){
            if(salesperson.getAmount() > result){
                result = salesperson.getAmount();
                best = salesperson;
            }
        }
        return best;
    }

    public Salesperson furthestFromTarget(List<Salesperson> salespeople){
        int diff=0;
        Salesperson best = null;
        for (Salesperson salesperson : salespeople){
            if(salesperson.getAmount()-salesperson.getTarget() > diff){
                diff = salesperson.getAmount()-salesperson.getTarget();
                best = salesperson;
            }
        }
        return best;
    }

    public Salesperson leastAchieved(List<Salesperson> salespeople){
        int diff=0;
        Salesperson worst = null;
        for (Salesperson salesperson : salespeople){
            if(salesperson.getTarget()-salesperson.getAmount() > diff){
                diff = salesperson.getTarget()-salesperson.getAmount();
                worst = salesperson;
            }
        }
        return worst;
    }


}
