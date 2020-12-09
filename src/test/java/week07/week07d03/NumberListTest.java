package week07.week07d03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberListTest {

    @Test
    public void numberListTester(){

        assertTrue(new NumberList().isIncreasing(Arrays.asList(1,2,3,3,3,5)));
        assertFalse(new NumberList().isIncreasing(Arrays.asList(1,2,3,3,5,3)));

    }

}