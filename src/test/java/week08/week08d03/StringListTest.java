package week08.week08d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListTest {

    @Test
    public void stringListTester(){

        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();
        List<String> result = new ArrayList<>();

        first.add("alma");
        first.add("korte");
        first.add("alma");
        first.add("szilva");

        second.add("barack");
        second.add("barack");
        second.add("dinnye");
        second.add("banan");
        second.add("alma");

        result = new StringList().stringListUnion(first, second);

        assertEquals(6, result.size());

        for(String s : result){
            System.out.println(s);
        }

    }

}