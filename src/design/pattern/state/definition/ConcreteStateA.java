package design.pattern.state.definition;

public class ConcreteStateA extends State {

	@Override
	public void handle1() {
		// 本状态下必须处理的逻辑
		System.out.println("ConcreteStateA handle1...");

	}

	@Override
	public void handle2() {
		// 设置当前状态为state2
		super.context.setCurrentState(Context.STATE2);

		// 过度到state1状态，由Context实现
		super.context.handle2();
	}

}
