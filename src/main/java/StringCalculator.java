import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by seungdols on 2017. 7. 30..
 */
public class StringCalculator {

	int add(String text) {
		if (text == null || text.isEmpty() || text.equals(" ")) {
			return 0;
		}

		String[] tokens = text.split(",");

		return sum(tokens);
	}

	private int sum(String[] tokens) {
		int sum = 0;
		for (String value : tokens) {
			sum += Integer.parseInt(value);
		}

		return sum;
	}

}
