package design.pattern.template;

public class ClientTest {

	public static void main(String[] args) {
		ITemplate class1 = new ConcreteClass1();
		class1.templateMethod();
		
		System.out.println("--------------------------");
		ITemplate class2 = new ConcreteClass2();
		class2.templateMethod();

	}

}
