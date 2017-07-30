import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by seungdols on 2017. 7. 30..
 */
public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	public void add() throws Exception {
		assertEquals(12, calculator.add(6,6));
	}

	@Test
	public void subtract() throws Exception {
		assertEquals(6, calculator.subtract(8,2));
	}

}