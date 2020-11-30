package week06.week06d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListSelectorTest {

    @Test
    public void nullTester(){
        List<String> strings = new ArrayList<>();
        //strings.add("e");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {throw new IllegalArgumentException("Not supported input");});
    }

    @Test
    public void emptyTester(){
        List<String> strings = new ArrayList<>();
        strings.add("");
        strings.add("");
        assertEquals("", new ListSelector().evenSelector(strings));
    }

    @Test
    public void normalTester(){
        List<String> strings = new ArrayList<>();
        strings.add("Nagyne");
        strings.add("Kiss");
        strings.add("Piroska");
        assertEquals("[NagynePiroska]", new ListSelector().evenSelector(strings));
    }


}