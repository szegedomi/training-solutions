package introjunit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    public void testCreate(){
        assertEquals(new Gentleman().sayHello("Domi"), ("Hello Domi"));
        assertEquals(new Gentleman().sayHello(""), ("Hello Anonymus"));

    }



}
