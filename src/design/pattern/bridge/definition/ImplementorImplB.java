package design.pattern.bridge.definition;

public class ImplementorImplB implements Implementor{

	@Override
	public void doSomething() {
		System.out.println("ImplementorImplB doSomethong...");
		
	}

	@Override
	public void doAnything() {
		System.out.println("ImplementorImplB doAnythong...");
		
	}

}
