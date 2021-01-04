package week10.week10d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    public void elevationTester(){

        Hiking hiking = new Hiking();

        assertEquals(13, hiking.getPlusElevation(Arrays.asList(10,20,15,18)));

    }


}