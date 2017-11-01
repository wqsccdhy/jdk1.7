package design.pattern.observer.demo;

public class ObserverTest {

	public static void main(String[] args) {

		IObserver iObserver1 = new ObserverImpl<Object>("张三");
		IObserver iObserver2 = new ObserverImpl<Object>("李四");
		IObserver iObserver3 = new ObserverImpl<Object>("王五");

		AbsObservable absObservable = new HanFeiZi("韩非子");
		absObservable.setNotify(true);
		absObservable.addObserver(iObserver1);
		absObservable.addObserver(iObserver2);
		absObservable.addObserver(iObserver3);
		absObservable.haveFun();
		absObservable.haveBreakfast();

	}

}
