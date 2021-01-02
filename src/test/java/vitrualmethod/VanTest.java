package vitrualmethod;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VanTest {
    @Test
    public void getGrossLoad() throws Exception {
        Van van = new Van(1200,1 , 200);

        assertEquals((1 + 1) * Car.PERSON_AVERAGE_WEIGHT + 1200 + 200, van.getGrossLoad());
    }

}