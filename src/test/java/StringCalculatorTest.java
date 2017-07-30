import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * Created by seungdols on 2017. 7. 30..
 */
public class StringCalculatorTest {

	StringCalculator stringCalculator;

	@Before
	public void setUp() throws Exception {
		stringCalculator = new StringCalculator();
	}

	@Test
	public void add_null_또는_빈문자() {
		assertEquals(0,stringCalculator.add(null));
		assertEquals(0,stringCalculator.add(""));
		assertEquals(0,stringCalculator.add(" "));
	}

	@Test
	public void add_숫자하나 () {
		assertEquals(1, stringCalculator.add("1"));
		assertEquals(6, stringCalculator.add("6"));
	}

	@Test
	public void add_쉼표구분자 () {
		assertEquals(3, stringCalculator.add("1,2"));
	}

}