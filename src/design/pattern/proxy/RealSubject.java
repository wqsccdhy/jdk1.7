package design.pattern.proxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("被代理者执行...");

	}

}
