package test.threadpoolexecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class BasicThreadPoolExecutorExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Executors.newSingleThreadExecutor();
		Executors.newFixedThreadPool(2);
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors
				.newCachedThreadPool();

		for (int i = 0; i <= 5; i++) {
			Task task = new Task("Task " + i);
			System.out.println("A new task has been added : " + task.getName());
			executor.execute(task);
		}
		
		System.out.println("------------------------------------------");
		/*for (int i = 0; i <= 5; i++) {
			TaskCall task = new TaskCall("Task " + i);
			Future<String> submit = executor.submit(task);
			System.out.println("A new task has been added : " + submit.get());
		}*/
		
		
		executor.shutdown();

	}

}
