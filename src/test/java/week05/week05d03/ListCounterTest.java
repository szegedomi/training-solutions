package week05.week05d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCounterTest {

    @Test
    public void ListCounterTesting(){

        assertEquals(0, new ListCounter().countElementsWithA(null));

        List<String> strings = new ArrayList<>();
        strings.add("");
        assertEquals(0, new ListCounter().countElementsWithA(strings));

        strings.add("alma");
        strings.add("répa");
        strings.add("Amogyoró");
        strings.add("retek");

        assertEquals(2, new ListCounter().countElementsWithA(strings));

    }


}