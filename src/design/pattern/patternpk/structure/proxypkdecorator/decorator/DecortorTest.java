package design.pattern.patternpk.structure.proxypkdecorator.decorator;

public class DecortorTest {

	public static void main(String[] args) {
		IDRunner runner = new DRunner();

		runner = new RunnerDecortor(runner);

		runner.run();
	}

}
