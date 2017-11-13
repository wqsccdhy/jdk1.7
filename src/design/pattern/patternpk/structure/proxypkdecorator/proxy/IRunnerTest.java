package design.pattern.patternpk.structure.proxypkdecorator.proxy;

public class IRunnerTest {

	public static void main(String[] args) {

		IRunner runner = new Runner();

		IRunner runnerProxy = new RunnerAgent(runner);

		runnerProxy.run();

	}

}
