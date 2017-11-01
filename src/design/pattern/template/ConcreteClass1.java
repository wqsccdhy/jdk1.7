package design.pattern.template;

public class ConcreteClass1 extends AbstractClass {

	@Override
	protected void doSomething() {
		System.out.println("ConcreteClass1 doSomething...");

	}

	@Override
	protected void doAnything() {
		System.out.println("ConcreteClass1 doAnything...");

	}

	@Override
	protected boolean isFlag() {
		return false;
	}

}
