package test.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class ReturnAfterSleepCallable implements Callable<Integer> {
	private int sleepSeconds;

	private int returnValue;

	public ReturnAfterSleepCallable(int sleepSeconds, int returnValue) {
		this.sleepSeconds = sleepSeconds;
		this.returnValue = returnValue;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(returnValue + " begin to execute.");

		TimeUnit.SECONDS.sleep(sleepSeconds);

		System.out.println(returnValue + " end to execute.");

		return returnValue;
	}
}
