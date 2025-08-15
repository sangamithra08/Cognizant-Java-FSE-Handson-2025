
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Demotest {
	
	    @Test
	    public void testAddition() {
	        demo calc = new demo();
	        int result = calc.add(3, 5);
	        assertEquals(8, result);
	    }

	    @Test
	    public void testMultiplication() {
	        demo calc = new demo();
	        int result = calc.multiply(4, 6);
	        assertEquals(24, result);
	    }
	}

