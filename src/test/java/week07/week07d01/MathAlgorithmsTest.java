package week07.week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    public void isPrimeTester(){
        assertEquals(true , new MathAlgorithms().isPrime(97));
    }

}