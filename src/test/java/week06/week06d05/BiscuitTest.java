package week06.week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiscuitTest {

    @Test
    public void biscuitTester(){
        assertEquals("Biscuit type: CHOCOLATE and grams of a unit is: 100 g.", Biscuit.of(BiscuitType.CHOCOLATE, 100).toString());

    }

}