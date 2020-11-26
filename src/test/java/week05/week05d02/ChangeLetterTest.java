package week05.week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeLetterTest {


    @Test
    public void ChangeLetterTesting(){
        assertEquals("H*ll* *nt*n**s!" , new ChangeLetter().changeVowels("Hello Antonius!"));
    }
}