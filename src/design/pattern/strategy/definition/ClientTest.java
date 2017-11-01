package design.pattern.strategy.definition;

public class ClientTest {

	public static void main(String[] args) {

		Strategy strategy = new StrategyImpl();

		StrategyContext context = new StrategyContext(strategy);

		context.doAnyThing();

	}

}
