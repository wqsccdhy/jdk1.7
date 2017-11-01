package design.pattern.decorator.definition;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		this.method();
		super.operation();
	}

	private void method() {
		System.out.println("ConcreteDecoratorB method 方法装饰...");
	}

}
