package week11.week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {


    @Test
    public void divisorFinderTest(){
        assertEquals( 3, new DivisorFinder().findDivisors(144));
        assertEquals( 2, new DivisorFinder().findDivisors(142));
    }

}