package design.pattern.decorator.definition;

public class Client {

	public static void main(String[] args) {
		
		Component component = new ConcreteComponent();
		
		Component componentA = new ConcreteDecoratorA(component);
		
		Component componentB = new ConcreteDecoratorB(componentA);
		
		componentB.operation();

	}

}
