package test.thread.threadlocal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 4个线程，两个线程对j加，两个线程对j减
 * 
 * @author Administrator
 * 
 */
public class ThreadLocalDemo {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch beginLatch = new CountDownLatch(1);
		CountDownLatch endLatch = new CountDownLatch(2);
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		ShareData data = new ShareData();
		Thread1 thread1 = new Thread1(data, beginLatch, endLatch);
		Thread2 thread2 = new Thread2(data, beginLatch, endLatch);

		for (int i = 0; i < 2; i++) {
			executorService.submit(thread1);
			executorService.submit(thread2);
		}

		beginLatch.countDown();
		endLatch.await();

		executorService.shutdown();

		int j = data.getJ();
		System.out.println("j:" + j);
	}

}
