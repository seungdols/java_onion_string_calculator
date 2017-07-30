import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by seungdols on 2017. 7. 30..
 */
public class StringCalculator {

	int add(String text) {
		if (isBlank(text)) {
			return 0;
		}

		return sum(toInts(split(text)));
	}

	private boolean isBlank(String text) {
		return text == null || text.isEmpty() || text.equals(" ");
	}

	private String[] split(String text) {
		return text.split(",");
	}

	private int[] toInts(String[] tokens) {
		int[] numbers = new int[tokens.length];
		for(int i= 0; i < tokens.length; i++) {
			numbers[i] = Integer.parseInt(tokens[i]);
		}
		return numbers;
	}

	private int sum(int[] tokens) {
		int sum = 0;
		for (int value : tokens) {
			sum += value;
		}

		return sum;
	}

}
