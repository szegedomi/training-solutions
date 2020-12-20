package week08.week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    public void MATester(){
        assertEquals(6, new MathAlgorithms().lnkoEuklid(84,18));
        assertEquals(6, new MathAlgorithms().lnkoEuklid(18,84));
        assertEquals(12, new MathAlgorithms().lnkoEuklid(12,36));

    }

}