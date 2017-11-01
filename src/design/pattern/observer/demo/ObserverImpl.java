package design.pattern.observer.demo;

import java.util.Observable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObserverImpl<V> implements IObserver {

	private String name;

	public ObserverImpl(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		final String currentName = this.name;
		final Observable observable = o;
		final Object para = arg;
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Callable<V> task = new Callable<V>() {

			@Override
			public V call() throws Exception {
				if (observable != null) {
					long x = (long) (Math.random() * 1000);
					Thread.sleep(x);
					AbsObservable absObservable = (AbsObservable) observable;
					String context = currentName + "观察到:" + absObservable.getName() + para;
					System.out.println(context);
				}

				return null;
			}

		};
		executor.submit(task);
		executor.shutdown();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
