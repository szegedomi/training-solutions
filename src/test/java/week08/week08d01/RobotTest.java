package week08.week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    public void robotTester(){

        assertEquals(2, new Robot(new Point(0,0)).move("FFBBLJFJJJ").getX());

    }

}