package design.pattern.patternpk.structure.proxypkdecorator.decorator;

public class RunnerDecortor implements IDRunner {

	private IDRunner runner;

	public RunnerDecortor(IDRunner runner) {
		super();
		this.runner = runner;
	}

	@Override
	public void run() {
		System.out.println("装饰模式：加强原有功能...");
		this.runner.run();

	}

}
