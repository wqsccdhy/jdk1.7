package design.pattern.strategy.definition;

public class StrategyContext {

	private Strategy strategy;

	public StrategyContext(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void doAnyThing() {
		this.strategy.doSomething();
	}

}
