package test.threadpoolexecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TaskCall implements Callable<String> {

	private String name;

	public TaskCall(String name) {
		super();
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		try {
			Long duration = (long) (Math.random() * 10);
			System.out.println("Doing a task during : " + name);
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			return name;
		}

	}

}
