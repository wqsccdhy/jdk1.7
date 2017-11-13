package design.pattern.patternpk.structure.proxypkdecorator.proxy;

import java.util.Random;

public class RunnerAgent implements IRunner {

	private IRunner runner;

	public RunnerAgent(IRunner runner) {
		super();
		this.runner = runner;
	}

	@Override
	public void run() {
		Random random = new Random();
		if (random.nextBoolean()) {
			System.out.println("代理人同意运动员跑步...");
			this.runner.run();
		} else {
			System.out.println("代理人不同意运动员跑步...");
		}

	}

}
