package design.pattern.decorator.definition;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		this.method();
		super.operation();
	}

	private void method() {
		System.out.println("ConcreteDecoratorA method 方法装饰...");
	}

}
