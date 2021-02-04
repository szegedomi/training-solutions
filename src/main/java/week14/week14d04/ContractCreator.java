package week14.week14d04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContractCreator {

    public Contract template;

    public ContractCreator(String client, List<Integer> monthlyPrices){
        this.template = new Contract(client, monthlyPrices);
    }

    public Contract create(String name){
        return new Contract(name, new ArrayList<>(this.template.getMonthlyPrices()));
    }

    public static void main(String[] args) {
        ContractCreator cc = new ContractCreator("john", Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,1,1));
        System.out.println(cc.create("jack").getClient());
        System.out.println(cc.create("jack").getMonthlyPrices());
        cc.create("John").getMonthlyPrices().set(0,10);
        Contract contract = cc.create("john");
        System.out.println(contract.getMonthlyPrices());
        System.out.println(contract.getClient());
        System.out.println(cc.create("john").getClient());
        System.out.println(cc.create("john").getMonthlyPrices());
    }


}
