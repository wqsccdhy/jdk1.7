package design.pattern.bridge.definition;

public class ImplementorImplA implements Implementor{

	@Override
	public void doSomething() {
		System.out.println("ImplementorImplA doSomethong...");
		
	}

	@Override
	public void doAnything() {
		System.out.println("ImplementorImplA doAnythong...");
		
	}

}
