package design.pattern.observer.demo;

import java.util.Observable;

/**
 * 被观察者
 * 
 * @author Administrator
 *
 */
public abstract class AbsObservable extends Observable {

	private String name;

	private boolean isNotify;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AbsObservable(String name) {
		super();
		this.name = name;
	}

	public boolean isNotify() {
		return isNotify;
	}

	public void setNotify(boolean isNotify) {
		this.isNotify = isNotify;
	}

	abstract void haveBreakfast();

	abstract void haveFun();

}
