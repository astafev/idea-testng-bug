import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SomeClassTest {
    @Test
    public void testSuccess() {
        assertEquals(new SomeClass().concat("a", "b"), "ab");
    }

    @Test
    public void testFailure() {
        assertEquals(new SomeClass().concat("a", "b"), "abc");
    }


}
