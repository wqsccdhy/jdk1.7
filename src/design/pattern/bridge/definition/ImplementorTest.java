package design.pattern.bridge.definition;

public class ImplementorTest {

	public static void main(String[] args) {
		
		
		Implementor implementor = new ImplementorImplA();
		Abstraction abstraction = new RefinedAbstraction(implementor);
		abstraction.operation();

	}

}
