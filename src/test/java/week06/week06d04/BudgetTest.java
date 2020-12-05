package week06.week06d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {

    @Test
    public void budgetTester(){

        Item item1 = new Item("Apple", 100, 10);
        Item item2 = new Item("Bread", 200, 8);
        Item item3 = new Item("Pen", 150, 10);
        Item item4 = new Item("iPhone", 300000, 11);

        Budget budget = new Budget(new ArrayList<Item>());
        budget.addItemToBudget(item1);
        budget.addItemToBudget(item2);
        budget.addItemToBudget(item3);
        budget.addItemToBudget(item4);

        assertEquals(2, budget.getItemsByMonth(10).size());

    }


}