import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepeaterTest{

    @Test
    void repeaterHelloTest() {
        Assertions.assertEquals("Hello", Repeater.repeat("Hello"));
    }
}
