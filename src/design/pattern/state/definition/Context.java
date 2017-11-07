package design.pattern.state.definition;

public class Context {

	// 定义状态

	public final static State STATE1 = new ConcreteStateA();

	public final static State STATE2 = new ConcreteStateB();

	// 当前状态
	private State currentState;

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;

		// 切换状态
		this.currentState.setContext(this);

	}

	public void handle1() {
		this.currentState.handle1();
	}

	public void handle2() {
		this.currentState.handle2();
	}

}
