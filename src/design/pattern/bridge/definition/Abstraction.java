package design.pattern.bridge.definition;

public abstract class Abstraction {

	private Implementor implementor;

	public Abstraction(Implementor implementor) {
		super();
		this.implementor = implementor;
	}

	public abstract void operation();

	public Implementor getImplementor() {
		return implementor;
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

}
