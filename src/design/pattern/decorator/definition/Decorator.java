package design.pattern.decorator.definition;

public abstract class Decorator implements Component {

	private Component component;

	public Decorator(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void operation() {
		this.component.operation();

	}

}
