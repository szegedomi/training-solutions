package week11.week11d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    public void wFilterTester(){

        List<String> words = Arrays.asList("alma", "korte", "barack", "szilva", "dinnye");

        assertEquals(3, new WordFilter().wordWithChar(words, 'a').size());

    }

}