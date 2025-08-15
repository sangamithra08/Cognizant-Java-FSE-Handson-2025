import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Myservicetest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3, "Expected 2 + 3 to equal 5");

        // Assert true
        assertTrue(5 > 3, "Expected 5 to be greater than 3");

        // Assert false
        assertFalse(5 < 3, "Expected 5 to not be less than 3");

        // Assert null
        Object obj = null;
        assertNull(obj, "Expected object to be null");

        // Assert not null
        Object newObj = new Object();
        assertNotNull(newObj, "Expected object to be not null");
    }
}
