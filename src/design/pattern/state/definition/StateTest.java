package design.pattern.state.definition;

public class StateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Context context = new Context();

		context.setCurrentState(new ConcreteStateA());

		context.handle1();
		context.handle2();

	}

}
