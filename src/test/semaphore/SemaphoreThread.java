package test.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreThread {

	/**
	 * 建立线程，调用内部类，开始存钱
	 */
	public void useThread() {
		Bank bank = new Bank();
		// 定义10个新号量
		Semaphore semaphore = new Semaphore(2);
		// 建立一个缓存线程池
		ExecutorService es = Executors.newCachedThreadPool();
		// 建立20个线程
		for (int i = 0; i < 10; i++) {
			// 执行一个线程
			es.submit(new Thread(new NewThread(bank, semaphore)));
		}
		// 关闭线程池
		es.shutdown();

		// 从信号量中获取两个许可，并且在获得许可之前，一直将线程阻塞
		semaphore.acquireUninterruptibly(2);
		System.out.println("到点了，工作人员要吃饭了");
		// 释放两个许可，并将其返回给信号量
		semaphore.release(2);
	}

	public static void main(String[] args) {
		SemaphoreThread test = new SemaphoreThread();
		test.useThread();
	}
}
