import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by seungdols on 2017. 7. 30..
 */
public class CalculatorTest {

	@Test
	public void add() throws Exception {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(3,4));
	}

	@Test
	public void subtract() throws Exception {
		Calculator calculator = new Calculator();
		System.out.println(calculator.subtract(9, 3));
	}

}