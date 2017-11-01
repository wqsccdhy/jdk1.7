package test;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Memoizerl<A, V> implements Computable<A, V> {

	private final ConcurrentMap<A, Future<V>> cache = new ConcurrentHashMap<A, Future<V>>();

	private final Computable<A, V> c;

	public Memoizerl(Computable<A, V> c) {
		this.c = c;
	}

	@Override
	public V compute(final A arg) throws InterruptedException {
		Future<V> future = cache.get(arg);
		if (future == null) {
			Callable<V> callable = new Callable<V>() {

				@Override
				public V call() throws Exception {
					return c.compute(arg);
				}
			};
			FutureTask<V> task = new FutureTask<V>(callable);
			future = cache.putIfAbsent(arg, task);
			if (future == null) {
				future = task;
				task.run();
			}
		}
		V v = null;
		try {
			v = future.get();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
	}

}
