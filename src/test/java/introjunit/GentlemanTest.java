package introjunit;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test
    public void testCreate(){
        assertThat(new Gentleman().sayHello("Domi"), equalTo("Hello Domi"));
        assertThat(new Gentleman().sayHello(""), equalTo("Hello Anonymus"));

    }



}
