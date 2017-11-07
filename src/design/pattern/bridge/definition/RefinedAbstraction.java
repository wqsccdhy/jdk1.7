package design.pattern.bridge.definition;

public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operation() {
		super.getImplementor().doAnything();
		super.getImplementor().doSomething();

	}

}
