package test.thread.threadlocal;

import java.util.concurrent.CountDownLatch;

public class Thread2 implements Runnable {

	private ShareData data;

	CountDownLatch beginLatch;

	CountDownLatch endLatch;

	public Thread2(ShareData data, CountDownLatch beginLatch,
			CountDownLatch endLatch) {
		this.data = data;
		this.beginLatch = beginLatch;
		this.endLatch = endLatch;
	}

	@Override
	public void run() {
		try {
			beginLatch.await();
			for (int i = 0; i < 5; i++) {
				this.data.dec();
			}
			
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			endLatch.countDown();
		}

	}

}
