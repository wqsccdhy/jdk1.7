package design.pattern.proxy;

public class Proxy implements Subject {

	private Subject subject;

	public Proxy() {
		this.subject = new Proxy();
	}

	public Proxy(Subject subject) {
		this.subject = subject;

	}

	@Override
	public void request() {
		beofer();
		subject.request();
		after();
	}

	private void beofer() {
		System.out.println("代理前处理...");
	}

	private void after() {
		System.out.println("代理后处理...");
	}

}
