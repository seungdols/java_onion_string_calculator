/**
 * Created by seungdols on 2017. 7. 30..
 */
public class Calculator {

	int add(int i, int j) {
		return i + j;
	}

	int subtract(int i, int j) {
		return i - j;
	}

	int multiply(int i, int j) {
		return i * j;
	}

	int devide(int i, int j) {
		return i / j;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(3,4));
		System.out.println(calculator.subtract(3,4));
		System.out.println(calculator.multiply(3, 4));
		System.out.println(calculator.devide(9,3));
	}

}
