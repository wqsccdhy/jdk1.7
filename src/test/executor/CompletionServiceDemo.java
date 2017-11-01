package test.executor;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public class CompletionServiceDemo {

	public static void main(String[] args) {
		
		int taskSize = 5;
		ExecutorService executor = Executors.newFixedThreadPool(2);
		// 构建完成服务
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(
				executor);

		for (int i = 1; i <= taskSize; i++) {
			int sleep = taskSize - i; // 睡眠时间

			int value = i; // 返回结果

			// 向线程池提交任务
			completionService
					.submit(new ReturnAfterSleepCallable(sleep, value));
		}

		// 按照完成顺序,打印结果
		for (int i = 0; i < taskSize; i++) {
			try {
				Future<Integer> take = completionService.take();
				//take.get(2, TimeUnit.SECONDS);
				System.out.println(take.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

		// 所有任务已经完成,关闭线程池
		System.out.println("all over.");
		executor.shutdown();
	}
}
