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
		assertEquals(0,stringCalculator.add(" "));
	}

}