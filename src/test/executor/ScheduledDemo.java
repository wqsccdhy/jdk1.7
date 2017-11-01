package test.executor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledDemo {

	private final static ScheduledExecutorService executorService = Executors
			.newScheduledThreadPool(5);

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
//		scheduleAtFixedRateRunnable();
		scheduleWithFixedDelayRunnable();
	}

	public static void scheduleWithFixedDelayRunnable() {
		final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 执行的任务 Callable或Runnable接口实现类
		Runnable command = new Runnable() {

			@Override
			public void run() {
				System.out.println("时间:" + sf.format(new Date()));
				try {
					TimeUnit.SECONDS.sleep(6);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};

		// 第一次执行任务延迟时间
		long initialDelay = 3;
		// 连续执行任务之间的周期，从上一个任务全部执行完成时计算延迟多少开始执行下一个任务
		long delay = 5;
		executorService.scheduleWithFixedDelay(command, initialDelay, delay,
				TimeUnit.SECONDS);
	}

	public static void scheduleAtFixedRateRunnable() {
		final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 执行的任务 Callable或Runnable接口实现类
		Runnable command = new Runnable() {

			@Override
			public void run() {
				System.out.println("时间:" + sf.format(new Date()));
				try {
					TimeUnit.SECONDS.sleep(6);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};
		// 第一次执行任务延迟时间
		long initialDelay = 3;
		// 连续执行任务之间的周期，从上一个任务开始执行时计算延迟多少开始执行下一个任务，但是还会等上一个任务结束之后
		long period = 5;
		ScheduledFuture<?> scheduleAtFixedRate = executorService
				.scheduleAtFixedRate(command, initialDelay, period,
						TimeUnit.SECONDS);

		System.out.println("isDone:" + scheduleAtFixedRate.isDone());
	}

	public static void scheduleCallable() {
		executorService.schedule(new Runnable() {

			@Override
			public void run() {
				System.out.println("延迟10秒后，返回run字符串并输出");

			}
		}, 10, TimeUnit.SECONDS);

		executorService.shutdown();
	}

	public static void scheduleRunnable() throws InterruptedException,
			ExecutionException {
		ScheduledFuture<String> future = executorService.schedule(
				new Callable<String>() {

					@Override
					public String call() throws Exception {
						return "延迟8秒后，返回call字符串并输出";
					}
				}, 8, TimeUnit.SECONDS);
		String string = future.get();
		boolean done = future.isDone();
		System.out.println("string:" + string);
		System.out.println("done:" + done);

		executorService.shutdown();
	}

}
