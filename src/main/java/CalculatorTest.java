/**
 * Created by seungdols on 2017. 7. 30..
 */
public class CalculatorTest {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		add(calculator);
		subtract(calculator);
		multiply(calculator);
		divide(calculator);

	}

	private static void add(Calculator calculator) {
		System.out.println(calculator.add(3, 4));

	}

	private static void subtract(Calculator calculator) {
		System.out.println(calculator.subtract(3, 4));

	}

	private static void multiply(Calculator calculator) {
		System.out.println(calculator.multiply(3, 4));
	}

	private static void divide(Calculator calculator) {
		System.out.println(calculator.devide(9, 3));

	}

}
