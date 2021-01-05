package week10.week10d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {

    @Test
    public void getMaxIndexTester(){

        assertEquals(4, new MaxTravel().getMaxIndex(Arrays.asList(12,12,0,4,3,4,4)));

    }


}