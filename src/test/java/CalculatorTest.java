import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by seungdols on 2017. 7. 30..
 */
public class CalculatorTest {

	@Test
	public void add() throws Exception {
		Calculator calculator = new Calculator();
		assertEquals(12, calculator.add(6,6));
	}

	@Test
	public void subtract() throws Exception {
		Calculator calculator = new Calculator();
		assertEquals(6, calculator.subtract(8,2));
	}

}