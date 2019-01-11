
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSuite_1 {

    @Test
    public void test1() {
        System.out.println("test1 text");
    }

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void mySecondTest() {
        assertEquals(3, 1 + 2);
    }


}
