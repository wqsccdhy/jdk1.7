package design.pattern.state.definition;

public class ConcreteStateB extends State {

	@Override
	public void handle1() {
		super.context.setCurrentState(Context.STATE1);

		super.context.handle1();

	}

	@Override
	public void handle2() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteStateB handle2...");

	}

}
