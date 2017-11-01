package design.pattern.strategy.demo;

public class Context {

	private IStratety stratety;

	public Context(IStratety stratety) {
		super();
		this.stratety = stratety;
	}

	public void operate() {
		this.stratety.operate();
	}

}
