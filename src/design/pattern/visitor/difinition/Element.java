package design.pattern.visitor.difinition;

public abstract class Element {

	public abstract void accept(IIVistor vistor);

	public abstract void doSomething();

}
