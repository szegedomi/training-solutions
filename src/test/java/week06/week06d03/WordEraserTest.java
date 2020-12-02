package week06.week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordEraserTest {

    @Test
    public void WordEraserTester(){

        WordEraser we = new WordEraser();

        assertEquals("World John Jack", we.eraseWord("Hello World Hello John Hello Jack","Hello"));

    }

}