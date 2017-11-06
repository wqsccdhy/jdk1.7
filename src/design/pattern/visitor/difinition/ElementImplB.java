package design.pattern.visitor.difinition;

public class ElementImplB extends Element {

	@Override
	public void accept(IIVistor vistor) {
		vistor.vistor(this);

	}

	@Override
	public void doSomething() {
		System.out.println("ElementImplB doSomething...");

	}

}
