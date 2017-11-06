package design.pattern.visitor.difinition;

public class IIVistorImpl implements IIVistor {

	@Override
	public void vistor(Element element) {
		element.doSomething();

	}

}
