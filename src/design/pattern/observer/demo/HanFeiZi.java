package design.pattern.observer.demo;

public class HanFeiZi extends AbsObservable {

	public HanFeiZi(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void haveBreakfast() {
		System.out.println(this.getName() + "开始吃饭...");
		super.setChanged();
		super.notifyObservers("开始吃饭...");

	}

	@Override
	void haveFun() {
		System.out.println(this.getName() + "开始娱乐...");
		if (isNotify()) {
			super.setChanged();
			super.notifyObservers("开始娱乐...");
		}

	}

}
