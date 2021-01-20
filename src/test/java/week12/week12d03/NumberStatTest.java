package week12.week12d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberStatTest {

    @Test
    public void numberStatTester(){
        assertEquals(3, new NumberStat().smallestUniqueInt(List.of(1,1,5,3,4,5,6,5,6,4,1,6,5,8,4)));
    }

}