package week08.week08d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    public void lotteryTester(){
        for(Integer i : new Lottery().getNumbers()){
            System.out.println(i);
        }
    }

}