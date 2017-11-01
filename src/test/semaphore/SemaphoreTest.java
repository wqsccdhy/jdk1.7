package test.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	private static final int PERMITS = 3;

	private static final int THREAD_NUM = 8;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 信号量的数目，也可理解为资源的数目
		Semaphore semaphore = new Semaphore(PERMITS , true);

		// 创建线程池
		ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_NUM);

		for (int i = 0; i < THREAD_NUM; i++) {
			threadPool.execute(new Worker(semaphore, i));
		}

		// 关闭线程池
		threadPool.shutdown();
	}

	public static class Worker implements Runnable {

		private Semaphore semaphore;
		private int id;

		public Worker(Semaphore semaphore, int id) {
			this.id = id;
			this.semaphore = semaphore;
		}

		@Override
		public void run() {

			try {

				System.out.println("Worker_" + id + " acquire...");
				// 获取许可
				semaphore.acquire();

				//Thread.sleep(2000);
				long millis = (long) (Math.random() * 10000);
				System.out.println("Worker_" + id + " " + millis);
				Thread.sleep(millis);

				System.out.println("Worker_" + id + " run...");

			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				// 访问完后，释放
				semaphore.release();
			}
		}

	}
}
