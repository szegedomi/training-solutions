package week09.week09d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibCalculatorTest {

    @Test
    public void fibTester(){
        FibCalculator fc = new FibCalculator();

        for (int i = 0; i<20; i++){
            System.out.println(fc.fib(i));
        }
    }

    @Test
    public void fibTester2() {
        FibCalculator fc = new FibCalculator();

        assertEquals(44, fc.sumEvents(100));

    }




    }