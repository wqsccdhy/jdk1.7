package design.pattern.strategy.extend;

public class CalculatorTest {

	public static void main(String[] args) {
		int exec = Calculator.ADD.exec(10, 5);
		System.out.println(exec);

	}

}
