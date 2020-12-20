package week08.week08d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void TrainerTester(){

        assertEquals(5, new Trainer(new GoodMood()).giveMark());
        assertEquals(3, new Trainer(new BadMood()).giveMark());

    }


}